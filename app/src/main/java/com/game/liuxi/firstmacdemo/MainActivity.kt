package com.game.liuxi.firstmacdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nh.setOnClickListener { startActivity(Intent(this, ButterKnifeActivity::class.java)) }
        dao.setOnClickListener { startActivity(Intent(this, GreenDaoActivity::class.java)) }
        arc.setOnClickListener { startActivity(Intent(this, ArcActivity::class.java)) }
    }


}
