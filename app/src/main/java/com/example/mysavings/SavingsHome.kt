package com.example.mysavings

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SavingsHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_savingshome)

        val newsavingsbtn = findViewById<Button>(R.id.newsavingsbtn)
        newsavingsbtn.setOnClickListener{
            val Intent = Intent(this,SavingsHome::class.java)
            startActivity(Intent)
        }

        val emergencysavingsbtn = findViewById<Button>(R.id.emergencysavingsbtn)
        emergencysavingsbtn.setOnClickListener{
            val Intent = Intent(this,SavingsHome::class.java)
            startActivity(Intent)
        }

        val bdaysavingsbtn = findViewById<Button>(R.id.bdaysavingsbtn)
        bdaysavingsbtn.setOnClickListener{
            val Intent = Intent(this,SavingsHome::class.java)
            startActivity(Intent)
        }

        val addsavingsbtn = findViewById<Button>(R.id.addsavingsbtn)
        addsavingsbtn.setOnClickListener{
            val Intent = Intent(this,Home::class.java)
            startActivity(Intent)
        }

        val cancelbutton = findViewById<Button>(R.id.cancelbutton)
        cancelbutton.setOnClickListener{
            val Intent = Intent(this,WelcomePage::class.java)
            startActivity(Intent)
        }
    }
}