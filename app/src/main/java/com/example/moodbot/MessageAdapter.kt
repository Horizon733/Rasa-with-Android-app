package com.example.moodbot

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(var context:Context,var messageList:MutableList<MessageClass>):RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {

    }
    
    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }



    class MessageViewHolder(view: View): RecyclerView.ViewHolder(view){

    }
}