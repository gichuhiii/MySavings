package com.example.mysavings

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signupbutton = findViewById<Button>(R.id.signupbtn)
        signupbutton.setOnClickListener{
            val Intent = Intent(this,Register::class.java)
            startActivity(Intent)
        }
        val loginbutton = findViewById<Button>(R.id.loginbtn)
        loginbutton.setOnClickListener{
            val Intent = Intent(this,Login::class.java)
            startActivity(Intent)
        }
        val cancelbutton = findViewById<Button>(R.id.cancelbutton)
        loginbutton.setOnClickListener{
            val Intent = Intent(this,WelcomePage::class.java)
            startActivity(Intent)
        }
    }
}