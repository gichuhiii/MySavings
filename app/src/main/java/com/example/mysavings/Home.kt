package com.example.mysavings

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val gotosavingsbtn = findViewById<Button>(R.id.gotosavingsbtn)
        gotosavingsbtn.setOnClickListener{
            val Intent = Intent(this,Home::class.java)
            startActivity(Intent)
        }

        val profilebtn = findViewById<Button>(R.id.profilebtn)
        profilebtn.setOnClickListener{
            val Intent = Intent(this,Profile::class.java)
            startActivity(Intent)
        }

        val logoutbtn = findViewById<Button>(R.id.logoutbtn)
        logoutbtn.setOnClickListener{
            val Intent = Intent(this,WelcomePage::class.java)
            startActivity(Intent)
        }

        val cancelbutton = findViewById<Button>(R.id.cancelbutton)
        cancelbutton.setOnClickListener{
            val Intent = Intent(this,WelcomePage::class.java)
            startActivity(Intent)
        }
    }
}