package com.example.mtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var eText = findViewById<EditText>(R.id.et_email)
        var btn = findViewById<Button>(R.id.bt_open)

        btn.setOnClickListener {
            var intent = Intent(this,SecondActytivy::class.java)
            intent.putExtra("key",eText.text.toString())
            startActivity(intent)

        }

    }

}


