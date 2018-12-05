package database.db_handlers;
import classModels.Answer;
import classModels.Member;
import classModels.Question;
import others.ResourceProvider;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

/**
 * Created by Taqui on 4/30/2017.
 */
public class DataUpdater
{
    // when admin creates new member, call me
    public static void createNewMember(Member member)
    {
        String name = member.getName(), id = member.getId(), gender = member.getGender(), password = member.getPassword(), email = member.getEmail();
        int age = member.getAge(), pointCount = member.getPointCount();
        ImageIcon displayPicture = member.getDisplayPicture();

        // AT FIRST we need to create a stream of display picture
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ImageIO.write(ResourceProvider.iconToBuffer(displayPicture),"png", os);
        } catch (IOException e) {
            System.out.println("ImageIcon to Buffered Image conversion failed.");
        }
        InputStream inputImage = new ByteArrayInputStream(os.toByteArray());

        // THEN, executeQuery with prepared statement
        String query = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = null;
        int i = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, id);
            ps.setString(4, gender);
            ps.setString(3, password);
            ps.setString(6, email);
            ps.setInt(5, age);
            ps.setInt(7, pointCount);
            ps.setBinaryStream(8, inputImage);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DataUpdater->CreateNewMember()->PreparedStatement Exception");
        }
        System.out.println(i + " records got affected.");
    }

    // update a member
    public static void updateMember(Member member) {
        String name = member.getName(), id = member.getId(), gender = member.getGender(), password = member.getPassword(), email = member.getEmail();
        int age = member.getAge(), pointCount = member.getPointCount();
        ImageIcon displayPicture = member.getDisplayPicture();

        // AT FIRST we need to create a stream of display picture
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ImageIO.write(ResourceProvider.iconToBuffer(displayPicture),"png", os);
        } catch (IOException e) {
            System.out.println("ImageIcon to Buffered Image conversion failed.");
        }
        InputStream inputImage = new ByteArrayInputStream(os.toByteArray());

        // Query part
        String query = "UPDATE MEMBER SET NAME = ?, ID = ?, PASSWORD = ?, GENDER = ?, AGE = ?, EMAIL = ?, COUNTED_POINT = ?, DP = ? WHERE ID = '" + id + "'";

        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = null;
        int i = 0;
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, id);
            ps.setString(3, password);
            ps.setString(4, gender);
            ps.setInt(5, age);
            ps.setString(6, email);
            ps.setInt(7, pointCount);
            ps.setBinaryStream(8, inputImage);
            i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DataUpdater->CreateNewMember()->PreparedStatement Exception");
        }
        System.out.println(i + " records got affected.");

    }

    // update a password
    public static int updateUserPassword(String id, String password) {
        int x = 0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "update member set password ='" + password + "' where id = '"+id+"'";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return x;
    }

    //  unlike
    public static void unLikeQuestion(Member member, Question question) {
        String query= "SELECT ID FROM MEMBER WHERE ID = (SELECT q1.MEMBER_ID FROM QUESTION q1, QUESTION_LIKE q2 WHERE q1.ID = q2.QUESTION_ID AND QUESTION_ID = " + question.getId() + ")";
        ResultSet table = DataProvider.getTable(query);
        String idRequired = null;
        try {
            if (table.next()) {
                idRequired = table.getString("ID");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        Member memberRequired = DataProvider.getMember(idRequired);
        query = "SELECT COUNTED_POINT FROM MEMBER WHERE ID = '" + memberRequired.getId() +"'";
        table = DataProvider.getTable(query);
        int point = 0;
        try {
            if (table.next()) {
                point  = table.getInt("COUNTED_POINT");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        point -= 1;
        memberRequired.setPointCount(point);
        DataUpdater.updateMember(memberRequired);

        query = "DELETE FROM QUESTION_LIKE WHERE MEMBER_ID = '" + member.getId() + "' AND QUESTION_ID = '" + question.getId() + "'";
        Connection conn = DatabaseConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void unLikeAnswer(Member member, Answer answer) {
        String query = "SELECT ANSWER.MEMBER_ID FROM PORTAL.ANSWER WHERE ANSWER.ID = " + answer.getId();
        ResultSet table = DataProvider.getTable(query);
        String idRequired = "";
        try {
            if (table.next()) {
                idRequired = table.getString("MEMBER_ID");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("ID: " + idRequired);
        Member memberRequired = DataProvider.getMember(idRequired);
        query = "SELECT COUNTED_POINT FROM MEMBER WHERE ID = '" + idRequired +"'";
        table = DataProvider.getTable(query);
        int point = 0;
        try {
            if (table.next()) {
                point = table.getInt("COUNTED_POINT");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        point -= 1;
        memberRequired.setPointCount(point);
        DataUpdater.updateMember(memberRequired);

        query = "SELECT RATING FROM ANSWER WHERE ID = " + answer.getId();
        table = DataProvider.getTable(query);
        int rating = 0;
        try {
            if (table.next()) {
                rating = table.getInt("RATING");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        rating -= 1;
        query = "UPDATE ANSWER SET RATING = " + rating + " WHERE ID = " + answer.getId();

        Connection conn = DatabaseConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "DELETE FROM ANSWER_LIKE WHERE MEMBER_ID = '" + member.getId() + "' AND ANSWER_ID = " + answer.getId();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // like

    public static void likeQuestion(Member member, Question question) {
        String query = "INSERT INTO QUESTION_LIKE VALUES ('" + member.getId() + "', " + question.getId() + ")";
        Connection conn = DatabaseConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        query= "SELECT ID FROM MEMBER WHERE ID = (SELECT q1.MEMBER_ID FROM QUESTION q1, QUESTION_LIKE q2 WHERE q1.ID = q2.QUESTION_ID AND QUESTION_ID = " + question.getId() + ")";
        ResultSet table = DataProvider.getTable(query);
        String idRequired = null;
        try {
            if (table.next()) {
                idRequired = table.getString("ID");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        Member memberRequired = DataProvider.getMember(idRequired);
        query = "SELECT COUNTED_POINT FROM MEMBER WHERE ID = '" + memberRequired.getId() +"'";
        table = DataProvider.getTable(query);
        int point = 0;
        try {
            if (table.next()) {
                point  = table.getInt("COUNTED_POINT");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        point += 1;
        memberRequired.setPointCount(point);
        DataUpdater.updateMember(memberRequired);
    }
    public static void likeAnswer(Member member, Answer answer) {
        String query = "INSERT INTO ANSWER_LIKE VALUES ('" + member.getId() + "', " + answer.getId() + ")";
        Connection conn = DatabaseConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        query = "SELECT ANSWER.MEMBER_ID FROM PORTAL.ANSWER WHERE ANSWER.ID = " + answer.getId();
        ResultSet table = DataProvider.getTable(query);
        String idRequired = "";
        try {
            if (table.next()) {
                idRequired = table.getString("MEMBER_ID");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("ID: " + idRequired);
        Member memberRequired = DataProvider.getMember(idRequired);
        query = "SELECT COUNTED_POINT FROM MEMBER WHERE ID = '" + idRequired +"'";
        table = DataProvider.getTable(query);
        int point = 0;
        try {
            if (table.next()) {
                point = table.getInt("COUNTED_POINT");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        point += 1;
        memberRequired.setPointCount(point);
        DataUpdater.updateMember(memberRequired);

        query = "SELECT RATING FROM ANSWER WHERE ID = " + answer.getId();
        table = DataProvider.getTable(query);
        int rating = 0;
        try {
            if (table.next()) {
                rating = table.getInt("RATING");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        rating += 1;
        query = "UPDATE ANSWER SET RATING = " + rating + " WHERE ID = " + answer.getId();

        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(query));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // when a member posts answer of a question
    public static void createNewPost(Answer answer, int questionId) {
        String title = answer.getTitle(), description = answer.getDescription(), memberID = answer.getMemberID();
        int rating = answer.getRating(), id = DataProvider.generateId("ANSWER");

        String query = "INSERT INTO ANSWER VALUES ('" + title + "', '" + description + "', '" + rating + "', '" +
                id + "', '" + memberID + "', '" + questionId + "')";
        Connection conn = DatabaseConnection.getConnection();
        int x = 0;
        try {
            Statement stmt = conn.createStatement();
            x = stmt.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(x + " new Answer for " + questionId);
    }

    // when a member posts question call me to store it into database
    public static void createNewQuestion(Question question, int topicId) {
        String title = question.getTitle(), description = question.getDescription(), memberID = question.getMemberID();
        int rating = question.getRating(), id = DataProvider.generateId("QUESTION");
        ImageIcon attachment = question.getAttachment();

        // AT FIRST we need to create a stream of display picture
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ImageIO.write(ResourceProvider.iconToBuffer(attachment),"png", os);
        } catch (IOException e) {
            System.out.println("ImageIcon to Buffered Image conversion failed.");
        }
        InputStream inputImage = new ByteArrayInputStream(os.toByteArray());

        // then...
        String query = "INSERT INTO QUESTION VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = null;
        int i = 0;

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setString(3, null);
            ps.setInt(4, id);
            ps.setString(5, memberID);
            ps.setInt(6, 0);
            ps.setInt(7, topicId);
            ps.setBinaryStream(8, inputImage);
            i = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Putting a question into database has been failed");
        }
        System.out.println(i + " records got affected.");
    }

	public static int deleteMember(String id){
        int x =0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "delete from member where id = '"+id+"'";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
    return x;
    }

    // new

    public static int saveNewCourse(String title,String description,int hits,int topicId){

        int x =0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query ="Insert into course values('"+title+"','"+description+"','"+hits+"','"+topicId+"')";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return x;
    }

    public static int saveNewTopic(String title,String description,int hits,int topicId, int courseId){

        int x =0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query ="Insert into topic values('"+title+"','"+description+"','"+hits+"','"+topicId+"','"+courseId+"')";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return x;
    }
    public static int deleteTopic(String title){
        int x =0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "delete from topic where title = '"+title+"'";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return x;
    }
    public static int deleteCourse(String title){
        int x =0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "delete from course where title = '"+title+"'";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return x;
    }
    public static void  setBestAnswer(String questionId, String answerId){
        int x = 0;
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "update question set BEST_ANS_ID ='" + answerId + "' where id = '"+questionId+"'";
            x = stmt.executeUpdate(query);
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
    }
}
