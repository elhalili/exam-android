package com.elhalili.exam_android.dao;

import com.elhalili.exam_android.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMemory implements UserDao {
    private List<User> users = new ArrayList<>();
    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getUserByEmail(String email) {
        for (User user: users) {
            if (user.getEmail().equals(email)) return user;
        }
        return null;
    }

    @Override
    public User save(User user) {
        if (getUserByEmail(user.getEmail()) != null) return null;

        users.add(user);
        return user;
    }
}
