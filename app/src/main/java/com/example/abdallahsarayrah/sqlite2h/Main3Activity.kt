package com.example.abdallahsarayrah.sqlite2h

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



        var userId = intent.getStringExtra("userId")

        Toast.makeText(this, "Welcome $userId", Toast.LENGTH_SHORT).show()
    }
}
