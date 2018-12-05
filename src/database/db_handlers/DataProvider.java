package database.db_handlers;

import classModels.*;

import javax.swing.*;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.*;

public class DataProvider {
    public static HashMap<Course, Vector<Topic>> topicListMapped;

    public static Member getMember(String memberId) { // call me when user tries to log in
        String query = "SELECT * FROM MEMBER WHERE ID = '" + memberId + "'";
        ResultSet memberInfo = getTable(query);
        Member member = null;
        try {
            if (memberInfo.next()) {
                Blob blob = memberInfo.getBlob("DP");
                member = new Member(memberInfo.getString("NAME"), memberInfo.getString("ID"), memberInfo.getString("GENDER"), memberInfo.getString("PASSWORD"), memberInfo.getString("EMAIL"), memberInfo.getInt("AGE"), memberInfo.getInt("COUNTED_POINT"), new ImageIcon(blob.getBytes(1, (int)blob.length())));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Member could not be fetched having memberId: " + memberId);
        }
        return member;
    }

    public static Vector<Member> getList(String type) {
        String query = null;
        if (type.equals("faculty"))
            query = "SELECT * FROM MEMBER WHERE ID LIKE '____-%'";
        else if (type.equals("student"))
            query = "SELECT * FROM MEMBER WHERE ID LIKE '__-%'";
        else
            query = "SELECT * FROM MEMBER";
        ResultSet memberTable = getTable(query);
        Vector<Member> list = new Vector<>();
        try {
            while (memberTable.next()) {
                Blob blob = memberTable.getBlob("DP");
                Member member = new Member(memberTable.getString("NAME"), memberTable.getString("ID"), memberTable.getString("GENDER"), memberTable.getString("PASSWORD"), memberTable.getString("EMAIL"), memberTable.getInt("AGE"), memberTable.getInt("COUNTED_POINT"), new ImageIcon(blob.getBytes(1, (int)blob.length())));

                list.add(member);
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
            System.out.println("Students or Faculties could not be fetched.");
        }
        return list;
    }

    // GET BEST ANSWER ID
    public static int getBestAnswerID(int questionID) {
        String query = "SELECT ID FROM ANSWER WHERE RATING = (SELECT MAX(RATING) FROM ANSWER WHERE QUESTION_ID = " + questionID + ")";
        ResultSet table = getTable(query);
        int bestAnsId = 0;
        try {
            if (table.next()) {
                bestAnsId = table.getInt("ID");
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return bestAnsId;
    }

    // getTopic
    public static Vector<Topic> getTopics(int courseId) {
        Vector<Topic> topics = new Vector<>();
        String query = "SELECT * FROM TOPIC WHERE COURSE_ID = '" + courseId + "'";
        ResultSet table = getTable(query);
        try {
            while(table.next()) {
                Topic topic = new Topic(table.getString("TITLE"), table.getString("DESCRIPTION"), table.getInt("HITS"), table.getInt("ID"));

                topics.add(topic);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Topics could not be fetched from course id");
        }
        return topics;
    }

    // topic wise
    public static Vector<Question> getQuestionsByTopic(String topicId) {
        String query = "SELECT q.* FROM QUESTION q WHERE q.TOPIC_ID = '" + topicId + "'";
        ResultSet questions = getTable(query);
        Vector<Question> List = new Vector<>();
        try {
            while(questions.next()) {
                Blob blob = questions.getBlob("ATTACHMENT");
                Question question = new Question(questions.getString("TITLE"), questions.getString("DESCRIPTION"), questions.getInt("RATING"), questions.getInt("ID"), questions.getString("MEMBER_ID"), questions.getInt("Best_Ans_ID"), new ImageIcon(blob.getBytes(1, (int)blob.length())));

                List.add(question);
            }
        }
        catch (SQLException ex) {
            System.out.println("Questions fetching by topic could not be done.!");
        }
        return List;
    }

    // course wise
    public static Vector<Question> getQuestionsByCourse(String courseId) {
        String query = "SELECT q.* FROM QUESTION q, TOPIC t, COURSE c WHERE q.TOPIC_ID = t.ID AND t.COURSE_ID = c.ID AND c.ID = '" + courseId + "'";
        ResultSet questions = getTable(query);
        Vector<Question> questionList = new Vector<>();
        try {
            while(questions.next()) {
                Blob blob = questions.getBlob("ATTACHMENT");
                Question question = new Question(questions.getString("TITLE"), questions.getString("DESCRIPTION"), questions.getInt("RATING"), questions.getInt("ID"), questions.getString("MEMBER_ID"), questions.getInt("Best_Ans_ID"), new ImageIcon(blob.getBytes(1, (int)blob.length())));

                questionList.add(question);
            }
        }
        catch (SQLException ex) {
            System.out.println("Questions fetching by course could not be done.!");
        }
        return questionList;
    }

    // Hashmap -> Course, List Topic
    public static HashMap<Course, Vector<Topic>> getCourseWiseTopics() {
        HashMap<Course, Vector<Topic>> myHash = new LinkedHashMap<>();
        if (topicListMapped == null) {

        }
        for (Course course : getCourses()) {
            Vector<Topic> topics = new Vector<>();
            topics.addAll(getTopics(course.getId()));
            myHash.put(course, topics);
        }
        topicListMapped = myHash;
        return topicListMapped;
    }

    public static Vector<Answer> getAnswers(String questionId) {
        String query = "SELECT a.* FROM ANSWER a WHERE a.QUESTION_ID = '" + questionId + "'";
        ResultSet answers = getTable(query);
        Vector<Answer> answerList = new Vector<>();
        try {
            while(answers.next()) {
                Answer answer = new Answer(answers.getString("TITLE"), answers.getString("DESCRIPTION"), answers.getInt("rating"), answers.getInt("ID"), answers.getString("MEMBER_ID"));

                answerList.add(answer);
            }
        } catch(SQLException ex) {
            System.out.println("Answers fetching from question id didn't work.");
        }
        return answerList;
    }

    public static Vector<Course> getCourses() {
        String query = "SELECT * FROM COURSE";
        ResultSet table = getTable(query);
        Vector<Course> courseList = new Vector<>();
        try {
            while(table.next()) {
                Course course = new Course();
                course.setTitle(table.getString("TITLE"));
                course.setDescription(table.getString("DESCRIPTION"));
                course.setId(table.getInt("ID"));
                course.setRating(table.getInt("HITS"));
                courseList.add(course);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return courseList;
    }

    public static Question getQuestion(String questionId) {
        Question question = null;
        String query = "SELECT * FROM QUESTION WHERE ID = '" + questionId + "'";
        ResultSet quesData = getTable(query);
        try {
            if (quesData.next()) {
                Blob blob = quesData.getBlob("ATTACHMENT");
                question = new Question(quesData.getString("TITLE"), quesData.getString("DESCRIPTION"), quesData.getInt("RATING"), quesData.getInt("ID"), quesData.getString("MEMBER_ID"), quesData.getInt("BEST_ANS_ID"), new ImageIcon(blob.getBytes(1, (int)blob.length())));
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Specific question could not be fetched.");
        }
        return question;
    }

    public static Answer getBestAnswer(String questionId) {
        int bestAnswerId = getBestAnswerID(Integer.parseInt(questionId));
        DataUpdater.setBestAnswer(questionId, Integer.toString(bestAnswerId));
        Answer bestAnswer = null;
        String query = "SELECT a.* FROM QUESTION q, ANSWER a WHERE q.ID = a.QUESTION_ID AND a.ID = q.BEST_ANS_ID AND q.ID = '" + questionId + "'";
        ResultSet ansData = getTable(query);
        int count = 0;
        try {
            while (ansData.next()) {
                ++count;
                bestAnswer = new Answer(ansData.getString("TITLE"), ansData.getString("DESCRIPTION"), ansData.getInt("RATING"), ansData.getInt("ID"), ansData.getString("MEMBER_ID"));
            }
        }
        catch(SQLException ex) {
            System.out.println("Best answer could not be fetched.");
        }
        if (count > 1)
            return null;
        return bestAnswer;
    }

    public static ImageIcon getImage(String memberId) {
        String query = "SELECT DP FROM MEMBER WHERE ID = '" + memberId + "'";
        ResultSet image = getTable(query);
        try {
            if (image.next()) {
                Blob blob = image.getBlob("DP");
                return (new ImageIcon(blob.getBytes(1, (int)blob.length())));
            }
        } catch (SQLException e) {
            System.out.println("Display picture could not be fetched.");
        }
        return null;
    }

    private DataProvider() { /* can't be instantiated by outsiders */ }

    public static ResultSet getTable(String query)
    {
        ResultSet table = null;
        try
        {
            Connection connection = DatabaseConnection.getConnection();
            Statement statement = connection.createStatement();
            table = statement.executeQuery(query);
            System.out.println(query + " has been executed");
        }
        catch(SQLException ex)
        {
            System.out.println("getTable Method error");
        }
        return table;
    }

    // checkAnswerLike
    public static boolean checkAnswerLike(Member member, Answer answer) {
        String query = "SELECT * FROM ANSWER_LIKE WHERE MEMBER_ID = '" + member.getId() + "' AND ANSWER_ID = '" + answer.getId() + "'";
        ResultSet table = getTable(query);
        try {
            if(table.next())
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // checkQuestionLike
    public static boolean checkQuestionLike(Member member, Question question) {
        String query = "SELECT * FROM QUESTION_LIKE WHERE MEMBER_ID = '" + member.getId() + "' AND QUESTION_ID = '" + question.getId() + "'";
        ResultSet table = getTable(query);
        try {
            if(table.next())
                return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // get the max id
    public static int generateId(String tableName) {
        String query = "SELECT MAX(ID) ID FROM " + tableName;
        ResultSet table = getTable(query);
        try {
            if(table.next()) {
                return (table.getInt("ID") + 1);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public static ArrayList<Member> getTopMemberList() {
        ArrayList<Member> memberList = new ArrayList<>();
        String query = "SELECT * FROM MEMBER ORDER BY COUNTED_POINT DESC";
        ResultSet rs = getTable(query);
        try {
            int i=0;
            while(rs.next() && i<10 ){
                Member member = new Member();
                member.setName(rs.getString("NAME"));
                member.setPointCount(rs.getInt("COUNTED_POINT"));
                memberList.add(member);
                i++;
            }
        }
        catch (SQLException ex) {
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return memberList;
    }
	
	public static ArrayList<String> getStudentsName(){
        ArrayList<String> studentsName = new ArrayList<>();
        String query = "SELECT * FROM MEMBER WHERE ID LIKE '__-%'";
        ResultSet rs = getTable(query);
        try {
            while(rs.next()){
                Member member = new Member();
                studentsName.add(rs.getString("NAME"));
            }
        }
        catch (SQLException ex) {
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return studentsName;
    }
    
    public static ArrayList<String> getFacultyNames(){
        ArrayList<String> facultyNames = new ArrayList<>();
        String query = "SELECT * FROM MEMBER WHERE ID LIKE '____-%'";
        ResultSet rs = getTable(query);
        try {
            while(rs.next()){
                Member member = new Member();
                facultyNames.add(rs.getString("NAME"));
            }
        }
        catch (SQLException ex) {
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return facultyNames;
    }
    
    public static Member getMemberByName(String name) {
        String query = "SELECT * FROM MEMBER WHERE name = '" + name + "'";
        ResultSet memberInfo = getTable(query);
        Member member = null;
        try {
            if (memberInfo.next()) {
                Blob blob = memberInfo.getBlob("DP");
                member = new Member(memberInfo.getString("NAME"), memberInfo.getString("ID"), memberInfo.getString("GENDER"), memberInfo.getString("PASSWORD"), memberInfo.getString("EMAIL"), memberInfo.getInt("AGE"), memberInfo.getInt("COUNTED_POINT"), new ImageIcon(blob.getBytes(1, (int)blob.length())));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Member could not be fetched having memberId: " + name);
        }
        return member;
    }
	
	// sabir new add
	
	public static ArrayList<String> getCourseNames(){
        ArrayList<String> courseName = new ArrayList<>();
        String query = "SELECT * FROM course";
        ResultSet rs = getTable(query);
        try {
            while(rs.next()){
                courseName.add(rs.getString("TITLE"));
            }
        }
        catch (SQLException ex) {
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return courseName;
    }
    
    public static String getCourseId(String courseName){
        
            String id = "";
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "select * from course where title = '"+courseName+"'";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
             id = rs.getString("id");
             return id;
            }
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return id;
    }
    public static String getTopicId(String topicName){
        
            String id = "";
        try{
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String query = "select * from topic where title = '"+topicName+"'";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
             id = rs.getString("id");
             return id;
            }
        }
        catch (SQLException ex){
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return id;
    }
    
    public static ArrayList<String> getTopicTitles(String courseId){
        ArrayList<String> topicTitle = new ArrayList<>();
        String query = "SELECT * FROM topic where course_id = '"+courseId+"'";
        ResultSet rs = getTable(query);
        try {
            while(rs.next()){
                topicTitle.add(rs.getString("TITLE"));
            }
        }
        catch (SQLException ex) {
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return topicTitle;
    }
    
    public static ArrayList<String> getQuestionDescription(String topicId){
        ArrayList<String> questionDescription = new ArrayList<>();
        String query = "SELECT * FROM question where topic_id = '"+topicId+"'";
        ResultSet rs = getTable(query);
        try {
            while(rs.next()){
                questionDescription.add(rs.getString("DESCRIPTION"));
            }
        }
        catch (SQLException ex) {
            System.out.println("DBDataProvider Exception::"+ex.getMessage());
        }
        return questionDescription;
    }

}