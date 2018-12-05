
package testDrivers;


import guiModels.ViewAllMemberClass;
import javax.swing.JFrame;

public class TestMainClass {
    public static JFrame frame;
    public static String id;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setBounds(300, 150, 1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ViewAllMemberClass());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.pack();
        
    }
    
}
