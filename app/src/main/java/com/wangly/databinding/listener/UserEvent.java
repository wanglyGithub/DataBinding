package com.wangly.databinding.listener;

import android.text.Editable;
import android.text.TextWatcher;

import com.wangly.databinding.domain.User;

/**
 * Created by wangly on 2016/9/5.
 */
public class UserEvent {
    private User user;


    public UserEvent(User user) {
        this.user = user;
    }

    public TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            user.name = s.toString();
        }
    };
}
