package com.example.nsbm_papers_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class c_ply_yearselection : AppCompatActivity() {
    private lateinit var  button8: Button
    private lateinit var button11: Button
    private lateinit var button10: Button
    private lateinit var button9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cply_yearselection)

        button8=findViewById(R.id.button8)
        button8.setOnClickListener {

            val intent = Intent(this@c_ply_yearselection, c_ply_1::class.java) //this @classname

            startActivity(intent)
        }
        button11=findViewById(R.id.button11)
        button11.setOnClickListener {

            val intent = Intent(this@c_ply_yearselection, c_ply_2::class.java) //this @classname

            startActivity(intent)
        }
        button10=findViewById(R.id.button10)
        button10.setOnClickListener {

            val intent = Intent(this@c_ply_yearselection, c_ply_3::class.java) //this @classname

            startActivity(intent)
        }
        button9=findViewById(R.id.button9)
        button9.setOnClickListener {

            val intent = Intent(this@c_ply_yearselection, c_ply_4::class.java) //this @classname

            startActivity(intent)
        }
    }
}