package com.example.nsbm_papers_application

import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class m_vict_3 : AppCompatActivity() {
    private lateinit var button1: ImageButton
    private lateinit var button2: ImageButton
    private lateinit var button3: ImageButton
    private lateinit var button4: ImageButton
    private lateinit var button5: ImageButton
    private lateinit var button6: ImageButton

    var mydownloadid:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvict3)
        button1=findViewById(R.id.imageButton1)
        button1.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/fob%2F21.1_Y1S1_18Oct2021_Management%20Process%20(1).pdf?alt=media&token=37e04842-742a-41ca-a7a5-c674eea492f9"))
                .setTitle("example1")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }

        button2=findViewById(R.id.imageButton2)
        button2.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/fob%2F21.1_Y1S1_25Oct2021_Financial%20Accounting%20(2).pdf?alt=media&token=6c82c23e-b2be-477e-92bc-5633c26660ec"))
                .setTitle("example2")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button3=findViewById(R.id.imageButton3)
        button3.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/fob%2FBusiness%20Communication%2021.1%20exam%20paper.pdf?alt=media&token=5a6f640b-c843-43ec-accd-3616d63643e9"))
                .setTitle("example3")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button4=findViewById(R.id.imageButton4)
        button4.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/fob%2FExcel%20Bootcamp%201.1%20-%20Final%20Accounts%20Practice%20Kit.pdf?alt=media&token=2bcd5d65-974e-4822-b257-a7e64cb711e1"))
                .setTitle("example4")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button5=findViewById(R.id.imageButton5)
        button5.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/fob%2FModel%20Paper%20-%20MP%2021.1%20(6%20Sept%202021)_Answers.pdf?alt=media&token=33232f55-a985-4be4-800e-bdb4c2c48be8"))
                .setTitle("example5")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button6=findViewById(R.id.imageButton6)
        button6.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/fob%2FModel%20Paper%20II%20Answers%20-%20MP%2021.1%20(9%20Sept%202021).docx.pdf?alt=media&token=4c48318f-9a6d-47e1-9ff8-b8531c4167cd"))
                .setTitle("example6")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }

        var br =object: BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                var id :Long? =p1?.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1)
                if (id==mydownloadid){
                    Toast.makeText(applicationContext, "Download completed", Toast.LENGTH_SHORT).show()
                }
            }
        }
        registerReceiver(br, IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE))
    }
}