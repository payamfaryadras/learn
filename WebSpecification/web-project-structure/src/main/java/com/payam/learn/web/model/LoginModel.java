package com.payam.learn.web.model;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginModel {
    private String userName;
    private String password;
    @NotEmpty(message = "{user.username.error}")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @NotEmpty(message = "{user.password.error}")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
