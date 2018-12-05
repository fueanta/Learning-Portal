package testDrivers;

import specialGUI.AnswerViewClass;
import specialGUI.QuestionViewClass;

import javax.swing.*;

/**
 * Created by Taqui on 5/1/2017.
 */
public class AnswerViewTestDriver
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new AnswerViewClass(301));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        // frame.setResizable(false);
    }
}
