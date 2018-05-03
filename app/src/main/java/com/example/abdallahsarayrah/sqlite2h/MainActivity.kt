package com.example.abdallahsarayrah.sqlite2h

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSignUp.setOnClickListener {
            var obj = DBHandler(this)
            var db = obj.writableDatabase
            db.execSQL("insert into users(id, password) values(?, ?)", arrayOf(editTextUserId.text.toString(), editTextPassword.text.toString()))
            Toast.makeText(this, "You can login now", Toast.LENGTH_SHORT).show()
        }

        buttonLogin.setOnClickListener {
            var obj = DBHandler(this)
            var db = obj.readableDatabase
            var cursor = db.rawQuery("select * from users where id = ? and password = ?", arrayOf(editTextUserId.text.toString(), editTextPassword.text.toString()))
            if (cursor.count > 0) {
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("userId", editTextUserId.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Either the userId or the password is wrong, Or you need to signUp because you aren't a user?!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
