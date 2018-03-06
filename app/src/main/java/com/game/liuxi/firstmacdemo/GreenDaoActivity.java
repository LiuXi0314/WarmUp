package com.game.liuxi.firstmacdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.game.liuxi.firstmacdemo.entity.DaoMaster;
import com.game.liuxi.firstmacdemo.entity.DaoSession;
import com.game.liuxi.firstmacdemo.entity.User;
import com.game.liuxi.firstmacdemo.entity.UserDao;

import java.util.List;
import java.util.Random;

import static java.sql.Types.NULL;

/**
 * Created by liuxi on 2018/3/6.
 */

public class GreenDaoActivity extends AppCompatActivity {

    private UserDao userDao;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(getApplicationContext(),"user.db");
        DaoMaster master = new DaoMaster(helper.getWritableDb());
        DaoSession session = master.newSession();
        userDao = session.getUserDao();
        insert();
        query();
    }


    private void insert(){
        for (int i = 0;i<50;i++){
            userDao.insert(new User(i,"liuxi", ((int)Math.random())));
        }

    }

    private void query(){
        List<User> users = userDao.queryBuilder().where(userDao.getPkProperty().isNotNull()).build().list();
        for (User user : users){
            Log.d("test",user.toString());
            userDao.delete(user);
        }

    }

}
