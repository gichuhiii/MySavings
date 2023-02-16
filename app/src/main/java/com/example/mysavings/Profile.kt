package com.example.mysavings

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backbtn = findViewById<Button>(R.id.backbtn)
        backbtn.setOnClickListener{
            val Intent = Intent(this,Home::class.java)
            startActivity(Intent)
        }

        val savebtn = findViewById<Button>(R.id.savebtn)
        savebtn.setOnClickListener{
            val Intent = Intent(this,Home::class.java)
            startActivity(Intent)
        }

        val logoutbtn = findViewById<Button>(R.id.logoutbtn)
        logoutbtn.setOnClickListener{
            val Intent = Intent(this,WelcomePage::class.java)
            startActivity(Intent)
        }

        val cancelbutton = findViewById<Button>(R.id.cancelbutton)
        cancelbutton.setOnClickListener{
            val Intent = Intent(this,Home::class.java)
            startActivity(Intent)
        }
    }
}