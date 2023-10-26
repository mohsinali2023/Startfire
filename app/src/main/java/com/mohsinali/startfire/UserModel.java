package com.mohsinali.startfire;

public class UserModel {
    private String email, password;

    public UserModel() {
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
