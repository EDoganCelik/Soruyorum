package DatabaseChecking;

import AccountChecking.MyProfile;
import java.awt.Image;
import java.awt.List;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

public class DBClass {

    //VERSIYON KONTROL
    public static String PROGRAM_VERSION = "3.15.92";
    //VERSIYON KONTROL
    private String soru_metni;
    private MyProfile profile;
    private String cevap_metni;

    public String getCevap_metni() {
        return cevap_metni;
    }

    public ImageIcon getIconQuestion() {
        return iconQuestion;
    }

    public ImageIcon getIconAnswer() {
        return iconAnswer;
    }

    public MyProfile getProfile() {
        return profile;
    }

    public Connection getCon() {
        return con;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public DBClass(MyProfile profile) {
        databaseLogin();
        this.profile = profile;
    }

    public boolean veri_cek(String username, String password) {

        try {

            return databaseSetup(username, password);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    private boolean databaseSetup(String username, String password) {
        return loginCorrect(username, password);
    }

    private boolean loginCorrect(String username, String password) {

        try {

            stmt = con.createStatement();
            sql = "select * from Hesap where hesap_kullanici_adi Collate SQL_Latin1_General_CP1254_CS_AS='" + username + "'";
            //Büyük küçük karakter kontrolü yapıyor Collate SQL_Latin1_General_CP1254_CS_AS bununla yapıyor
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //profil bilgileri çekilerek uygulama hafızasına kaydediliyor
                profile.setAccount_username(rs.getString("hesap_kullanici_adi"));
                if (rs.getInt("hesap_is_teacher") != 1) {
                    profile.setUnvan("Öğrenci");
                } else {
                    profile.setUnvan("Öğretmen");
                }
                //profili çekiyor
                profile.setId(rs.getInt("hesap_id"));
                profile.setAccount_name(rs.getString("hesap_ad"));
                profile.setAccount_Surname(rs.getString("hesap_soyad"));
                profile.setIs_teacher(rs.getInt("hesap_is_teacher"));
                this.password = rs.getString("hesap_password");   //şifreyi bağlıyor

                profile.setTexts();//MyProfil sayfası oluşturuluyor
            }
            //Giriş kontrolü yapılarak doğru-yanlış yanıtı yollanıyor.
            return this.password.trim().equals(password);

        } catch (SQLException e) {
            e.printStackTrace();//Hata veriyorsa zaten şifre hatalıdır ve false değerini dönüyoruz
            return false;
        }

    }

    public void passChange(String password, String newPassword) throws SQLException {

        sql = "select * from Hesap where hesap_kullanici_adi Collate SQL_Latin1_General_CP1254_CS_AS='" + profile.getAccount_name() + "'";
        //Büyük küçük karakter kontrolü yapıyor Collate SQL_Latin1_General_CP1254_CS_AS bununla yapıyor
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            this.password = rs.getString("hesap_password").trim();//olası boşluk hatası varsa önler
        }
        if (this.password.equals(password)) {
            sql = "update Hesap set hesap_password='" + newPassword + "' where hesap_id=" + getProfile().getId();
            //Hesap tablosunda profile id'si şu olan verinin şifresini değiştirmesi için sql kodu
            addUpdateQuery(sql);//Sql kodunu çalıştırır
        } else {

            throw new SQLException();//Şifre hatalı hatasını yollamak için yazdığımız exception

        }
    }
    private String db_name,db_username,db_password;
    private void databaseLogin() {
        try {
            //Veritabanı bağlantısını oluşturuyor
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databaseName="+db_name, db_username, db_password);
            stmt = con.createStatement();
        } catch (SQLException e) {
            errorMessage(e);
        }
    }

    public void addUpdateQuery(String query) {
        try {
            rs = stmt.executeQuery(query);//Update Yapıyor

        } catch (SQLException ex) {
            errorMessage(ex);
        }
    }

    private void errorMessage(Exception ex) {
        System.out.println(ex.getMessage());
    }

    private void addQuery(String query) {
        try {
            stmt.executeQuery(query);//query çalıştırıyor
        } catch (SQLException ex) {
            errorMessage(ex);
        }
    }

    public String getSoru_metni() {
        return soru_metni;
    }

    public Image queryImage(int soru_id) {

        try {
            addUpdateQuery("select * from Soru where soru_id=" + soru_id);//kodu çalıştırıyor
            while (rs.next()) {//read işlemi yapılıyor
                soru_metni = rs.getString("soru_metin");//soru_metin adındaki column çekilioyr
                blob = rs.getBlob("soru_resim");//soru_resim adındaki blob veri çekilioyr
                InputStream is = blob.getBinaryStream();// bir input stream ile bu veriyi okuyoruz
                rawBytes = blob.getBytes(1, (int) blob.length());//verimizi yazıyoruz.
                iconQuestion = new ImageIcon(rawBytes);//Bir ImageIcon nesnesi oluşturarak resmi hazırlıyoruz.
                return iconQuestion.getImage();//resmi return ederek fonksiyondan çıkıyoruz
            }
        } catch (SQLException e) {
            errorMessage(e);
        }
        return null;
    }

    public Image queryImageForAnswer(int cevap_id) {

        try {
            addUpdateQuery("select * from Cevaplar where cevap_id=" + cevap_id);
            while (rs.next()) {
                cevap_metni = rs.getString("cevap_metin");
                blob = rs.getBlob("cevap_resim");
                InputStream is = blob.getBinaryStream();
                rawBytes = blob.getBytes(1, (int) blob.length());

                iconAnswer = new ImageIcon(rawBytes);
                System.out.println("test");
                return iconAnswer.getImage();

            }
            iconAnswer = null;
        } catch (SQLException e) {
            errorMessage(e);
        }
        return null;
    }

    public void initList(List list) {

        try {
            addUpdateQuery("select soru_id from Soru where hesap_id=" + profile.getId());
            while (rs.next()) {

                list.add("Soru ID : " + String.valueOf(rs.getInt("soru_id")));
            }

        } catch (SQLException e) {
            errorMessage(e);
        }
    }

    public void initList(List list, boolean isTeacher) {

        try {

            getOgretmenDers();//Öğretmenin dersini çekiyor
            addUpdateQuery("select soru_id,cevap_metin from Soru  left join Cevaplar on cevap_id=soru_id and ders_id=" + profile.getDers());
            //Select ile soruları çekiyoruz. Left join kullanarak cevabı olmayan soruları sadece çekmiş oluyoruz.
            while (rs.next()) {
                if (rs.getString("cevap_metin") == null) {
                    list.add("Soru ID : " + String.valueOf(rs.getInt("soru_id")));//Çektiğimiz soruları sırasıyla Listemize yolluyoruz.
                }//Yolladığımız bu veriler daha sonra Soruları Cevapla sayfasında kullanılacak ve işimize yarayacak.

            }

        } catch (SQLException e) {
            errorMessage(e);
        }
    }

    public boolean hesapKayit(String kullaniciAdi, String hesapAd, String hesapSoyad, String password, int brans, Boolean isTeacher) throws Exception {

        if (hesapKontrol(kullaniciAdi)) {
            return false;
        } else {
            if (isTeacher) {
                sqlFormat = String.format("insert into Hesap values('%s','%s','%s','%s','%d')", kullaniciAdi, password, hesapAd, hesapSoyad, 1);
                addQuery(sqlFormat);
                execOgretmen(kullaniciAdi, brans);
            } else {
                sqlFormat = String.format("insert into Hesap values('%s','%s','%s','%s',%d)", kullaniciAdi, password, hesapAd, hesapSoyad, 0);
                addQuery(sqlFormat);
                execOgrenci(kullaniciAdi);
            }
            return true;
        }
    }

    private void execOgretmen(String kullaniciAdi, int ders_id) throws SQLException {

        addUpdateQuery("select * from Hesap where hesap_kullanici_adi='" + kullaniciAdi.trim() + "'");

        while (rs.next()) {

            id = rs.getInt("hesap_id");

        }
        sqlFormat = String.format("insert into Ogretmen values(%d,%d)", id, ders_id);//sağdaki ifadeleri sırasıyla stringe yerleştiriyor
        addQuery(sqlFormat);

    }

    private void getOgretmenDers() {

        try {
            addUpdateQuery("select * from Ogretmen where hesap_id=" + profile.getId());

            while (rs.next()) {

                profile.setDers(rs.getInt("ders_id"));
            }
        } catch (SQLException e) {
            errorMessage(e);
        }
    }

    private void execOgrenci(String kullaniciAdi) {
        try {
            addUpdateQuery("select hesap_id from Hesap where hesap_kullanici_adi='" + kullaniciAdi.trim() + "'");

            while (rs.next()) {

                id = rs.getInt("hesap_id");

            }
            sqlFormat = String.format("insert into Ogrenci values(%d)", id);//sağdaki ifadeleri sırasıyla stringe yerleştiriyor
            addQuery(sqlFormat);
        } catch (SQLException e) {
            errorMessage(e);
        }
    }

    private boolean hesapKontrol(String kullaniciAdi) throws SQLException {
        int a = 0;
        String kullanici = "";

        addUpdateQuery("select hesap_kullanici_adi from Hesap where hesap_kullanici_adi='" + kullaniciAdi + "'");
        while (rs.next()) {
            kullanici = rs.getString("hesap_kullanici_adi");
        }
        if (kullanici.equalsIgnoreCase(kullaniciAdi)) {
            return true;
        } else {
            return false;

        }

    }

    private String sql;
    private boolean show = false;
    private ImageIcon iconQuestion;
    private ImageIcon iconAnswer;
    private Blob blob;//Fotoğraf kaydetmek için
    private FileOutputStream fos;
    private Connection con;// bağlantıyı oluşturmak için C# Connection
    private String sqlFormat = "";//sql kodlarını çalıştırmak için kullanılır
    private Statement stmt;//sql kodlarını çalıştırmak için 
    private ResultSet rs;//tablodaki verileri çekmek için C# DataReader
    private String password;
    private int id;
    private byte[] rawBytes = null;
}
