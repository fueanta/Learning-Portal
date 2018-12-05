package classModels;

import java.util.Vector;

/**
 * Created by Taqui on 4/29/2017.
 */
public class Topic extends Material
{
    // attributes
    private Vector<Question> questions;
    // up to this

    // constructors
    public Topic() {/* default constructor */}

    public Topic(String title, String description, int rating, int id) {
        super(title, description, rating, id);
    }
    // up to this...

    // getter and setter
    public Vector<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Vector<Question> questions) {
        this.questions = questions;
    }
    // up to this...
}
