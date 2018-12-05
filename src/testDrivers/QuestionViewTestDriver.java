package testDrivers;

import database.db_handlers.DataProvider;
import specialGUI.QuestionViewClass;
import static main.LearningPortal.currentMember;

import javax.swing.*;

/**
 * Created by Taqui on 5/1/2017.
 */
public class QuestionViewTestDriver {
    public static JFrame dframe;
    public static void main(String[] args) {
        currentMember = DataProvider.getMember("2016-06-01-01"); // 2016-06-01-01
        dframe = new JFrame();
        dframe.getContentPane().add(new QuestionViewClass(101));
        dframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        dframe.pack();
        dframe.setVisible(true);
        dframe.setResizable(false);
    }
}
