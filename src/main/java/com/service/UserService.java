package com.service;

import com.dao.UserDao;
import com.model.Users;

public class UserService {
    private UserDao userDao;
 
    public boolean isUsers(String username, String password) {
        Users user = userDao.findByUserName(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
 
    public UserDao getUserDao() {
        return userDao;
    }
 
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
