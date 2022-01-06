package com.example.mtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActytivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_actytivy)

        var getData = intent.extras?.get("key")
        var text = findViewById<TextView>(R.id.tx_text)
        text.text = getData.toString()
    }
}