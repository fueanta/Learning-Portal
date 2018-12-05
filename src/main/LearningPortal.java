package main;

import classModels.Course;
import classModels.Member;
import guiModels.LoginViewClass;
import others.ResourceProvider;

import javax.swing.*;

public class LearningPortal {
    public static JFrame frame;
    public static JPanel previousPanel;
    public static Member currentMember;
    public static Course currentCourse;

    public static String id;

    public static void main(String[] args) {
        String lookName = "Nimbus";
        try {
            UIManager.setLookAndFeel(ResourceProvider.getUI(lookName));
        } catch (Exception e) {
            System.out.println(lookName + " look could not be achieved.");
        }
        finally {
            frame = new JFrame();
        }
        frame.setBounds(300, 150, 1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new LoginViewClass());
        frame.setResizable(false);
        frame.setTitle("Log in here...");
        frame.pack();
        frame.setVisible(true);
    }
}
