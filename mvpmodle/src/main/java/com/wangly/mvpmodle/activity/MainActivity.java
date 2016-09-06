package com.wangly.mvpmodle.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.wangly.mvpmodle.R;
import com.wangly.mvpmodle.biz.ResultCallBack;
import com.wangly.mvpmodle.databinding.ActivityMainBinding;
import com.wangly.mvpmodle.event.LoginEvent;
import com.wangly.mvpmodle.modle.Login;
import com.wangly.mvpmodle.presenter.Presenter;
import com.wangly.mvpmodle.view.LoginView;


/**
 * 有MVP 演变至 MVVM
 * 也就是对View Activity 进行拆分
 *
 */
public class MainActivity extends AppCompatActivity implements LoginView, ResultCallBack {

    private ProgressBar progressBar;
    private Login user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        user = new Login();
        binding.setUser(user);
        LoginEvent event = new LoginEvent(user);
        binding.setEvent(event);


    }

    public void login(View view) {
        Presenter presenter = new Presenter();
        presenter.login(this,this);
    }


    @Override
    public String getUserName() {
        return user.userName;
    }

    @Override
    public String getPassword() {
        return user.password;
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void dismissProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showToast(String toast) {
        Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void Success(Login login) {
        Intent intent = new Intent(this,SuccessActivity.class);
        intent.setAction(this.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putSerializable("javaBean",login);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void Failed(String error) {

    }
}
