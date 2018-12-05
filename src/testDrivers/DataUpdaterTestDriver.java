package testDrivers;

import classModels.Member;
import database.db_handlers.DataProvider;
import database.db_handlers.DataUpdater;
import others.ResourceProvider;

import javax.swing.*;

/**
 * Created by Taqui on 4/30/2017.
 */
public class DataUpdaterTestDriver {
    public static void main(String[] args) {
        /*Member member = new Member();
        member.setName("Ahmad, Mutasim Billah Bin");
        member.setId("16-31533-1");
        member.setAge(22);
        member.setEmail("fueanta@gmail.com");
        member.setGender("Male");
        member.setPassword("12345");
        member.setPointCount(32);
        member.setDisplayPicture(new ImageIcon("C:\\Users\\Taqui\\Pictures\\sample employees pics\\kalo.jpg"));
        DataUpdater.updateMember(member);

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(new JLabel(ResourceProvider.resizeImage(DataProvider.getImage("16-31533-1"), 500, 500)));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/

        /*Member member = DataProvider.getMember("16-31533-1");
        member.setPassword("jalali");
        DataUpdater.updateMember(member);*/

        DataUpdater.updateUserPassword("16-31533-1", "julekha");
    }
}
