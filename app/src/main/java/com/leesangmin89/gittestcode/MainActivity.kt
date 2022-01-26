package com.leesangmin89.gittestcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "연습2", Toast.LENGTH_SHORT).show()

        val text = "연습이라고"
        print(text)
    }
}