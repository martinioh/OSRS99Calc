package com.example.osrs99toolkit

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtTitle.text = "OSRS 99 Calculator"

        btnAttack.setOnClickListener(){
            Toast.makeText(this,"Attack",Toast.LENGTH_SHORT).show()
        }


    }
}

