package classModels;

import javax.swing.*;
import java.util.Vector;

/**
 * Created by Taqui on 4/28/2017.
 */

public class Member implements Comparable<Member>
{
    // attributes
    private String name, id, gender, password, email;
    private int age, pointCount;
    private ImageIcon displayPicture;
    private Vector<Course> courses;
    // up to this

    // constructors
    public Member() { /* Empty Constructor */}

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Member(String name, String id, String gender, String password, String email, int age, int pointCount, ImageIcon displayPicture) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.age = age;
        this.pointCount = pointCount;
        this.displayPicture = displayPicture;
        // this.courses = courses;
    }

    // up to this

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPointCount() {
        return pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    public ImageIcon getDisplayPicture() {
        return displayPicture;
    }

    public void setDisplayPicture(ImageIcon displayPicture) {
        this.displayPicture = displayPicture;
    }

    public Vector<Course> getCourses() {
        return courses;
    }

    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }
    // up to this...

    @Override
    public String toString() {
        return this.name;
    }

    // implementation of comparable
    @Override
    public int compareTo(Member member) {
        return this.name.compareTo(member.name);
    }
}

