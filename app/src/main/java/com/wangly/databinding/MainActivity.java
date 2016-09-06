package com.wangly.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.wangly.databinding.databinding.ActivityMainBinding;
import com.wangly.databinding.domain.User;
import com.wangly.databinding.listener.UserEvent;

/**
 * MVP ---> MVVM
 * <p/>
 * 使用Google 的 DataBimding
 */
public class MainActivity extends AppCompatActivity {


    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.name = "小明";

//        user.name.set("小明");
        binding.setUser(user);


        UserEvent event = new UserEvent(user);
        binding.setEvent(event);


    }

    /**
     * 可以直接在子线程中更新ＵＩ　但是必须ｎｏｔｉｆｙ
     *
     * @param view
     */
    public void childThread(View view) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                user.name.set("测试数据值！");

            }
        }.start();
    }


    public void ToastInfo(View view) {
        Toast.makeText(this, "View ---> Modle " + user.name, Toast.LENGTH_SHORT).show();
    }
}
