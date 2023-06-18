package com.user;

import java.util.List;

import com.CommonCodeManager;
import com.UserDao;
import com.UserModel;

public class UserController {
    // Autowire or Generator Injection in Spring
    CommonCodeManager commonCodeManager;
    UserDao userDao = new UserDao();

    public UserController(CommonCodeManager commonCodeManager) {
        this.commonCodeManager = commonCodeManager;
    }

    public List<UserModel> selectUserLevelList() {
        return userDao.selectList();
    }
}