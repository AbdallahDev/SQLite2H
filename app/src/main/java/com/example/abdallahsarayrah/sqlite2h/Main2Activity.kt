package com.example.abdallahsarayrah.sqlite2h

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val intent = intent.extras
        val `var` = intent!!.getString("userId")
    }
}
