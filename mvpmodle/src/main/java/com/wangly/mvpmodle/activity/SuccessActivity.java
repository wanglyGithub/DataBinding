package com.wangly.mvpmodle.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wangly.mvpmodle.R;
import com.wangly.mvpmodle.modle.Login;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        TextView textView = (TextView) findViewById(R.id.tv_info);
        Login login = (Login) getIntent().getSerializableExtra("javaBean");
        textView.setText(login.getUserName() + "登录成功!!!");
//        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_success);

//        binding.setUser(login);


    }
}
