package testDrivers;

import classModels.Answer;
import classModels.Question;
import database.db_handlers.DataProvider;
import others.GUI_Engine;
import others.ResourceProvider;

import javax.swing.*;
import java.util.Queue;
import java.util.Vector;

public class GUI_EngineTestDriver {
    public static void main(String[] args) {
        // Vector<Answer> answers = DataProvider.getAnswers("301");
        Vector<Question> questions = DataProvider.getQuestionsByCourse("101");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        /*for (Answer answer : answers) {
            panel.add(GUI_Engine.createAnswerPanel(answer));
        }*/
        for (Question question : questions) {
            panel.add(GUI_Engine.createQuestionDemoPanel(question));
        }
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        // frame.setResizable(false);
    }
}
