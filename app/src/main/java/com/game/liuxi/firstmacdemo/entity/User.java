package com.game.liuxi.firstmacdemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by liuxi on 2018/3/6.
 */

@Entity
public class User {
    @Id
    private long id;

    @Property(nameInDb = "USER_NAME")
    private String name;


    @Property(nameInDb = "USER_LEVER")
    private int level;


    @Generated(hash = 1467473203)
    public User(long id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }


    @Generated(hash = 586692638)
    public User() {
    }


    public long getId() {
        return this.id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getLevel() {
        return this.level;
    }


    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return id+" "+name + " "+ level;
    }
}
