package com.game.liuxi.firstmacdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by liuxi on 2018/3/6.
 */

public class ButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.tv) TextView textView;
    @BindString(R.string.butter_test) String string;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);
        textView.setText(string);

    }
    @OnClick(R.id.tv)
    public void test(){
        textView.setText(string+"1111");
    }
}
