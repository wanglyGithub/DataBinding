package com.wangly.mvpmodle.modle;

import java.io.Serializable;

/**
 * Created by wangly on 2016/8/22.
 */
public class Login implements Serializable{
    public String userName;
    public String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Login{" +
                "password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
