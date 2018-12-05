package classModels;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Taqui on 4/28/2017.
 */
public class Question extends Material
{
    // attributes...
    private String memberID;
    private int bestAnswerID;
    private ImageIcon attachment;
    private Vector<Answer> answers;
    // up to this...

    // constructors
    public Question() { /* default constructor */ }

    public Question(String title, String description, int rating, int id, String memberID, int bestAnswerID, ImageIcon attachment) {
        super(title, description, rating, id);
        this.memberID = memberID;
        this.bestAnswerID = bestAnswerID;
        this.attachment = attachment;
    }
    // up to this

    // getters and setters
    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public int getBestAnswerID() {
        return bestAnswerID;
    }

    public void setBestAnswerID(int bestAnswerID) {
        this.bestAnswerID = bestAnswerID;
    }

    public ImageIcon getAttachment() {
        return attachment;
    }

    public void setAttachment(ImageIcon attachment) {
        this.attachment = attachment;
    }

    public Vector<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Vector<Answer> answers) {
        this.answers = answers;
    }
    // up to this...


    @Override
    public String toString() {
        return this.getDescription();
    }
}
