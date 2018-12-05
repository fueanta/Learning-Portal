package others;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by Taqui on 4/30/2017.
 */
public class ResourceProvider {
    public static BufferedImage iconToBuffer(ImageIcon icon)
    {
        BufferedImage bi = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
// paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0,0);
        g.dispose();
        return bi;
    }

    public static ImageIcon fileChooser(JButton browseButton, int width, int height) // ex: button, 260, 250
    {
        JFileChooser uploadWindow = new JFileChooser();
        uploadWindow.setDialogTitle("Upload photo");
        uploadWindow.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = uploadWindow.showOpenDialog(browseButton);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = uploadWindow.getSelectedFile();
            return (resizeImage(file, width, height));
        }
        System.out.println("File chooser did't work.");
        return null;
    }

    public static ImageIcon resizeImage(File file, int width, int height) // resize image from File object
    {
        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = picture.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        try {
            g2.drawImage(ImageIO.read(file), 0, 0, width, height, null);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Picture could not be resized.");
        }
        g2.dispose();
        return (new ImageIcon(picture));
    }

    public static ImageIcon resizeImage(ImageIcon icon, int width, int height) // resize image from ImageIcon
    {
        BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = picture.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(iconToBuffer(icon), 0, 0, width, height, null);
        g2.dispose();
        return (new ImageIcon(picture));
    }

    public static String getUI(String UIName) // ex: Nimbus
    {
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo look : looks) {
            if (look.getName().contains(UIName))
                return look.getClassName();
        }
        return null;
    }

    public static String checkStatus(String status) {
        if (status.charAt(2) == '-')
            return "Student";
        else
            return "Faculty";
    }

}

    /*String lookName = "Nimbus";
        try {
                UIManager.setLookAndFeel(ResourceProvider.getUI(lookName));
                } catch (Exception e) {
                System.out.println(lookName + " look could not be achieved.");
                }
                finally {
                new NewEmployeeGUI();
                }*/
