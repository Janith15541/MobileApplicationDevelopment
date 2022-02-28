package com.example.nsbm_papers_application

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nsbmclub : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button10: Button
    private lateinit var button11: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nsbmclub)

        button1 = findViewById(R.id.button)

        button1.setOnClickListener {

            val i = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://chat.whatsapp.com/Io7qLIPOeJy0egvEPOQmNh")
            )
            startActivity(i)
        }
            button1 = findViewById(R.id.button)

            button1.setOnClickListener {

                val i = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://chat.whatsapp.com/Io7qLIPOeJy0egvEPOQmNh")
                )
                startActivity(i)
            }
                button8 = findViewById(R.id.button8)

                button8.setOnClickListener {

                    val i = Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://chat.whatsapp.com/Io7qLIPOeJy0egvEPOQmNh")
                    )
                    startActivity(i)
                }
                    button9 = findViewById(R.id.button9)

                    button9.setOnClickListener {

                        val i = Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://chat.whatsapp.com/Io7qLIPOeJy0egvEPOQmNh")
                        )
                        startActivity(i)
                    }
                        button10= findViewById(R.id.button10)

                        button10.setOnClickListener {

                            val i = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://chat.whatsapp.com/Io7qLIPOeJy0egvEPOQmNh")
                            )

                            startActivity(i)
                        }
                            button11 = findViewById(R.id.button11)

                            button11.setOnClickListener {

                                val i = Intent(
                                    Intent.ACTION_VIEW,
                                    Uri.parse("https://chat.whatsapp.com/Io7qLIPOeJy0egvEPOQmNh")
                                )
                                startActivity(i)
        }
    }
}