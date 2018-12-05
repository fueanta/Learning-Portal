package others;

import classModels.Answer;
import classModels.Member;
import classModels.Question;
import database.db_handlers.DataProvider;
import guiModels.AnswerClass;
import guiModels.QuestionClass;
import guiModels.QuestionDemoPanel;

import static main.LearningPortal.currentMember;

public class GUI_Engine {
    /*public static QuestionClass createQuestionPanel(Question question) {
        Member member = DataProvider.getMember(question.getMemberID());

        QuestionClass questionPanel = new QuestionClass();
        questionPanel.getDpLabel().setIcon(ResourceProvider.resizeImage(member.getDisplayPicture(), 72, 65));
        questionPanel.getUserNameLabel().setText(member.getName());
        questionPanel.getQuestionArea().setText(question.getDescription());
        questionPanel.setQuestion(question);
        return questionPanel;
    }*/

    public static AnswerClass createAnswerPanel(Answer answer) {
        Member member = DataProvider.getMember(answer.getMemberID());

        AnswerClass answerPanel = new AnswerClass();
        answerPanel.getDpLabel().setIcon(ResourceProvider.resizeImage(member.getDisplayPicture(), 67, 60));
        answerPanel.getUserNameLabel().setText(member.getName());
        answerPanel.getAnswerArea().setText(answer.getDescription());
        answerPanel.setAnswer(answer);
        if (DataProvider.checkAnswerLike(currentMember, answer)) {
            answerPanel.getLikeButton().setText("Unlike");
        }
        return answerPanel;
    }

    public static QuestionDemoPanel createQuestionDemoPanel(Question question) {
        // System.out.println("being used");
        Member member = DataProvider.getMember(question.getMemberID());

        QuestionDemoPanel questionPanel = new QuestionDemoPanel(question);
        questionPanel.getDpLabel().setIcon(ResourceProvider.resizeImage(member.getDisplayPicture(), 72, 65));
        questionPanel.getUserNameLabel().setText(member.getName());
        questionPanel.getQuestionArea().setText(question.getDescription());
        // questionPanel.setQuestion(question);

        if (DataProvider.checkQuestionLike(currentMember, question)) {
            questionPanel.getLikeButton().setText("Unlike");
        }
        return questionPanel;
    }
}
