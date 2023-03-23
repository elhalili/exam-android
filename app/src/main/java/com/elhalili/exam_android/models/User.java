package com.elhalili.exam_android.models;

import java.io.Serializable;

public class User implements Serializable {
    private String fulName;
    private String email;
    private String password;
    private int phone;

    public User(String fulName, String email, String password, int phone) {
        this.fulName = fulName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }
    public User() {}

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
