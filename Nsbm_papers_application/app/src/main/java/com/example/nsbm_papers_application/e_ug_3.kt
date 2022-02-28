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

class e_ug_3 : AppCompatActivity() {
    private lateinit var button1: ImageButton
    private lateinit var button2: ImageButton
    private lateinit var button3: ImageButton
    private lateinit var button4: ImageButton
    private lateinit var button5: ImageButton
    private lateinit var button6: ImageButton

    var mydownloadid:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eug3)
        button1=findViewById(R.id.imageButton1)
        button1.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foe%2FEngineering%20Mechanics%20and%20Materials%20Science.pdf?alt=media&token=09271f7f-fcac-48c3-9e6a-ffabea640d00"))
                .setTitle("example1")
                .setDescription("engineering mechanic")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }

        button2=findViewById(R.id.imageButton2)
        button2.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foe%2FDigital%20Systems.pdf?alt=media&token=6dd3ea68-cfbb-46bb-945c-3a4add56cf7f"))
                .setTitle("example2")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button3=findViewById(R.id.imageButton3)
        button3.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foe%2FFundamentals%20of%20Electrical%20Engineering%20(1).pdf?alt=media&token=4c29e053-c159-47bf-b253-10e3a9eecd3c"))
                .setTitle("example3")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button4=findViewById(R.id.imageButton4)
        button4.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foe%2FHigh%20Voltage%20Engineering.pdf?alt=media&token=75d1b8a3-d65f-4933-a213-b6d024d8af3f"))
                .setTitle("example4")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button5=findViewById(R.id.imageButton5)
        button5.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foe%2FIntelligent%20Systems.pdf?alt=media&token=8fbfdb53-e759-48b2-93a5-e26d304c54c0"))
                .setTitle("example5")
                .setDescription("paper of the university")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setAllowedOverMetered(true)



            var dm=getSystemService(Context.DOWNLOAD_SERVICE)as DownloadManager

            mydownloadid=dm.enqueue(request)
        }
        button6=findViewById(R.id.imageButton6)
        button6.setOnClickListener {

            var request = DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/learningapp-bf153.appspot.com/o/foe%2FProbability%20and%20Statistics.pdf?alt=media&token=0e2c121c-701e-4dc4-a603-ddeeca94a4e5"))
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