package com.elhalili.exam_android.business;

import com.elhalili.exam_android.dao.UserDao;
import com.elhalili.exam_android.dao.UserDaoMemory;
import com.elhalili.exam_android.models.User;

public class DefaultServices implements Services {
    private static Services instance;
    public static Services getInstance() {
        if (instance == null) instance = new DefaultServices(new UserDaoMemory());

        return instance;
    }
    private UserDao userDao;
    private DefaultServices(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public User login(String email, String password) {
        User user = searchUserByEmail(email);

        if (user == null || !user.getPassword().equals(password)) return null;

        return user;
    }

    @Override
    public User register(String fullName, int phone, String email, String password) {
        User user = new User(fullName, email, password, phone);

        return addUser(user);
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User searchUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }
}
