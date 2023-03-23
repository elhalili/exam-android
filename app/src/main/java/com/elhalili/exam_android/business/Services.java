package com.elhalili.exam_android.business;

import com.elhalili.exam_android.models.User;

public interface Services {
    User login(String email, String password);
    User register(String fullName, int phone, String email, String password);
    User addUser(User user);
    User searchUserByEmail(String email);
}
