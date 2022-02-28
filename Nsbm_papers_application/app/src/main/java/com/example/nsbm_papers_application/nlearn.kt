package com.example.nsbm_papers_application

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nlearn : AppCompatActivity() {
    private lateinit var button1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nlearn)
        button1=findViewById(R.id.button)


        button1.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://nlearn.nsbm.ac.lk/login/index.php"))
            startActivity(i)

        }
    }
}