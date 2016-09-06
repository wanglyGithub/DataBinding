package com.wangly.mvpmodle.biz;

import com.wangly.mvpmodle.modle.Login;

/**
 * Created by wangly on 2016/8/22.
 *
 */
public interface ResultCallBack {
    /**
     * 登陆成功
     * @param login  JavaBean
     */
    void Success(Login login);

    /**
     * 登陆失败
     * @param error ErrorException
     */
    void Failed(String error);
}
