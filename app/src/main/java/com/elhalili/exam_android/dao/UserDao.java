package com.elhalili.exam_android.dao;

import com.elhalili.exam_android.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getUserByEmail(String email);
    User save(User user);
}
