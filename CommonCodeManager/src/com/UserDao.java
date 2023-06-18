package com;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<UserModel> selectList() {
        List<UserModel> list = new ArrayList<UserModel>();

        list.add(new UserModel("a", "이하늘", "2"));
        list.add(new UserModel("b", "임시1", "1"));
        list.add(new UserModel("c", "임시2", "0"));

        return list;
    }
}
