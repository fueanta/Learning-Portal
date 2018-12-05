package testDrivers;

import database.db_handlers.DataProvider;
import main.LearningPortal;
import specialGUI.CourseSelectionPanel;

import javax.swing.*;

import static main.LearningPortal.currentMember;
import static main.LearningPortal.frame;

/**
 * Created by Taqui on 5/2/2017.
 */
public class Linker {
    public static void main(String[] args) {
        currentMember = DataProvider.getMember("16-31533-1");
        frame = new JFrame();
        frame.getContentPane().add(new CourseSelectionPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
