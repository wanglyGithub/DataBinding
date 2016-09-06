package com.wangly.mvpmodle.presenter;

import com.wangly.mvpmodle.biz.HandlerCallBack;
import com.wangly.mvpmodle.biz.LoginUtils;
import com.wangly.mvpmodle.biz.ResultCallBack;
import com.wangly.mvpmodle.modle.Login;
import com.wangly.mvpmodle.view.LoginView;

/**
 * Created by wangly on 2016/8/22.
 */
public class Presenter {
    private LoginUtils loginBiz;
    private ResultCallBack back;
    public void login(final LoginView loginView, final ResultCallBack back) {
        loginBiz = new LoginUtils();
        this.back = back;
        loginView.showProgress();
        loginBiz.login(loginView.getUserName(), loginView.getPassword(), new HandlerCallBack() {
            @Override
            public void Success(Login login) {
                loginView.showToast("登录成功");
                loginView.dismissProgress();
                if (back != null){
                    back.Success(login);
                }

            }

            @Override
            public void Failed(final String error) {
                loginView.showToast(error);
                loginView.dismissProgress();
                if (back != null){
                    back.Failed(error);
                }
            }
        });
    }
}
