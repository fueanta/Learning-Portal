package classModels;

import java.util.Vector;

/**
 * Created by Taqui on 4/29/2017.
 */
public class Course extends Material {
    private Vector<Topic> topics;

    public Course() {

    }

    public Course(String title, String description, int rating, int id, Vector<Topic> topics) {
        super(title, description, rating, id);
        this.topics = topics;
    }

    public Vector<Topic> getTopics() {
        return topics;
    }

    public void setTopics(Vector<Topic> topics) {
        this.topics = topics;
    }
}
