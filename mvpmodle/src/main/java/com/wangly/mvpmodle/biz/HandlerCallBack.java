package com.wangly.mvpmodle.biz;

import com.wangly.mvpmodle.modle.Login;

/**
 * Created by wangly on 2016/9/6.
 * 用于处理Thread+Handler+InterfaceCallBack 的形式
 */
public interface HandlerCallBack {

    void Success(Login login);

    void Failed(String error);
}
