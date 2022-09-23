package DatabaseChecking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuestionClass {

    private DBClass db;
    private File file;
    private FileInputStream fis;
    private byte[] rawBytes = null;
    private String filePath = "";
    private PreparedStatement st;
    private int imageLength;

    public QuestionClass(DBClass db, String filePath) {
        this.db = db;
        this.filePath = filePath;
        file = new File(this.filePath);
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuestionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        imageLength = Integer.parseInt(String.valueOf(file.length()));
        rawBytes = new byte[imageLength];

    }
    //stler sırasıyla soru işaretine koyuyor

    public void questionQuery(String soru_text, String resim, int ders_id, int hesap_id) throws SQLException, IOException {
         
            st = db.getCon().prepareStatement("insert into Soru(soru_metin,soru_resim,ders_id,hesap_id) values(?,?,?,?)");

            st.setString(1, soru_text);
            fis.read(rawBytes, 0, imageLength);
            st.setBytes(2, rawBytes);//binary şeklinde resim ekliyor
            st.setInt(3, ders_id);
            st.setInt(4, hesap_id);
            st.executeUpdate();//sql kodunu çalıştırıyor
        
    }

    public void answerQuery(String cevap_text, String resim, int cevap_id) throws SQLException, IOException {
      
            st = db.getCon().prepareStatement("insert into Cevaplar(cevap_id,cevap_resim,cevap_metin) values(?,?,?)");//cevap kodu
            st.setInt(1, cevap_id);//cevap id oluşturuyor
            st.setString(3, cevap_text);//cevabın metnini yazıyor
            fis.read(rawBytes, 0, imageLength);//binary şeklinde resim ekliyor
            st.setBytes(2, rawBytes);//resmi veritabanı kodunun içine ekliyor
            st.executeUpdate(); //sql kodunu çalıştırıyor
         
    }

}
