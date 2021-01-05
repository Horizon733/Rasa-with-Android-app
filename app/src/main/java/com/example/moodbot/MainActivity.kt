package com.example.moodbot

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.moodbot.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainActivity:ActivityMainBinding
    private lateinit var messageList:ArrayList<MessageClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivity = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivity.root)
        mainActivity.sendBtn.setOnClickListener{
            mainActivity.messageBox.setText("")
            Toast.makeText(this, "Message sent", Toast.LENGTH_SHORT).show()
        }
        val msg = mainActivity.messageBox.text
        messageList = ArrayList<MessageClass>()
 
    }
}