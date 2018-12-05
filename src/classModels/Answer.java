package classModels;

/**
 * Created by Taqui on 4/29/2017.
 */
public class Answer extends Material
{
    private String memberID;

    public Answer() {

    }

    public Answer(String title, String description, int rating, int id, String memberID) {
        super(title, description, rating, id);
        this.memberID = memberID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
}
