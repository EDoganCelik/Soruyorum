package FilesFolder;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileSelect {

    private File file = null;

    private JFileChooser chooser;

    public FileSelect() {
        chooser = new JFileChooser("Lütfen Dosyayı Seçiniz");
    }

    public String dosyaSec() {

        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        chooser.addChoosableFileFilter(imageFilter);
        chooser.setFileFilter(imageFilter);

        String dosya = "";

        fileSetting();
        fileLookInstall();

        SwingUtilities.updateComponentTreeUI(chooser);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            dosya = file.toString();
            return dosya;
        }

        System.gc();
        return null;

    }

    private static void fileLookInstall() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex) {
        }
    }

    public void siteGirici(String siteId) {
        try {
            URI uri = new URI(siteId);
            Desktop dt = Desktop.getDesktop();

            dt.browse(uri);
            uri = null;
            dt = null;
            System.gc();
        } catch (IOException | URISyntaxException ex) {

        }
    }

    private static void fileSetting() {
        UIManager.put("FileChooser.openDialogTitleText", "Dosya Adı");
        UIManager.put("FileChooser.lookInLabelText", "Dosya yolu");
        UIManager.put("FileChooser.openButtonText", "Dosyayı Aç");
        UIManager.put("FileChooser.cancelButtonText", "İptal");
        UIManager.put("FileChooser.fileNameLabelText", "Dosya Adı");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Dosya Türü");
        UIManager.put("FileChooser.openButtonToolTipText", "Dosyayı Açıyor..");
        UIManager.put("FileChooser.cancelButtonToolTipText", "İptal");
        UIManager.put("FileChooser.fileNameHeaderText", "Dosya adı");
        UIManager.put("FileChooser.upFolderToolTipText", "Yukarı çık");
        UIManager.put("FileChooser.homeFolderToolTipText", "Masaüstü");
        UIManager.put("FileChooser.newFolderToolTipText", "Yeni klasör oluştur");
        UIManager.put("FileChooser.listViewButtonToolTipText", "Liste");
        UIManager.put("FileChooser.newFolderButtonText", "Yeni Klasör oluştur");
        UIManager.put("FileChooser.renameFileButtonText", "Dosya adını değiştir");
        UIManager.put("FileChooser.deleteFileButtonText", "Dosyayı sil");
        UIManager.put("FileChooser.filterLabelText", "Dosya tipi");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Simge");
        UIManager.put("FileChooser.fileSizeHeaderText", "Size");
        UIManager.put("FileChooser.fileDateHeaderText", "DateModified");
        UIManager.put("FileChooser.fileRightClick", "DateModified");
        UIManager.put("FileChooser.helpButtonToolTipText", "Yardım");
    }
}
