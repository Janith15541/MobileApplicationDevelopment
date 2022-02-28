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

class c_ply_4 : AppCompatActivity() {

    var mydownloadid:Long=0
    private lateinit var button1: ImageButton
    private lateinit var button2: ImageButton
    private lateinit var button3: ImageButton
    private lateinit var button4: ImageButton
    private lateinit var button5: ImageButton
    private lateinit var button6: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cply4)
        button1=findViewById(R.id.imageButton1)
        button1.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%2F21.1_Y1S1_24Oct2021_Programming%20in%20C.pdf?alt=media&token=d3ebc14d-8f7a-4b92-af58-50704e61e103"))
                .setTitle("example1")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }

        button2=findViewById(R.id.imageButton2)
        button2.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%2F21.1_Y1S1_28Oct2021_Mathematics%20for%20Computing.pdf?alt=media&token=2a444fe9-2888-4505-a0d6-9aaafda0ddd7"))
                .setTitle("example2")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button3=findViewById(R.id.imageButton3)
        button3.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%2F21.1_Y1S1_18Oct2021_English%20for%20Communication%20Skills.pdf?alt=media&token=a3f010df-cfa7-4cc0-814c-d3c26ae98549"))
                .setTitle("example3")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button4=findViewById(R.id.imageButton4)
        button4.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%2F21.1_Y1S1_30Oct2021_Database%20Management%20Systems%20(1).pdf?alt=media&token=aaad50a3-aefc-48fb-b8ae-a1eafbee3bc6"))
                .setTitle("example4")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button5=findViewById(R.id.imageButton5)
        button5.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%2F21.1_Y1S1_18Oct2021_English%20for%20Communication%20Skills.pdf?alt=media&token=a3f010df-cfa7-4cc0-814c-d3c26ae98549"))
                .setTitle("example5")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button6=findViewById(R.id.imageButton6)
        button6.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foc%2F21.1_Y1S1_22Oct2021_Introduction%20to%20Computer%20Science.pdf?alt=media&token=f535f8f1-7a2a-4a77-9835-4aebde08f1ac"))
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