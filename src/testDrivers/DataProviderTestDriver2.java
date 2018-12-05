package testDrivers;

import classModels.Member;
import database.db_handlers.DataProvider;
import database.db_handlers.DataUpdater;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Taqui on 5/1/2017.
 */
public class DataProviderTestDriver2 {
    public static void main(String[] args) {
        /*Vector<Member> members = DataProvider.getList("");
        ArrayList<Member> mems = new ArrayList<>(members);
        for (Member member : mems) {
            System.out.println(member.getName());
        }*/

        for (Member member : DataProvider.getTopMemberList()) {
            System.out.println(member.getName());
        }
    }
}
