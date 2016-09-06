package com.wangly.mvpmodle.event;

import android.text.Editable;
import android.text.TextWatcher;

import com.wangly.mvpmodle.modle.Login;

/**
 * Created by wangly on 2016/9/5.
 */
public class LoginEvent {

    private Login user;

    public LoginEvent(Login login) {
        this.user = login;
    }


    public TextWatcher userNameWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            user.userName = editable.toString();
        }
    };


    public TextWatcher passWordWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            user.password = editable.toString();
        }
    };


}
