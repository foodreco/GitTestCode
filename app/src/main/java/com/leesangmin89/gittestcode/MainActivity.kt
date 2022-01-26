package com.leesangmin89.gittestcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "연습1", Toast.LENGTH_SHORT).show()


        Toast.makeText(this, "Third branch", Toast.LENGTH_SHORT).show()

    }
}