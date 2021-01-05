package com.example.moodbot

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(var context:Context,var messageList:MutableList<MessageClass>):RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.message_item_list,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messageList[position]
        if(message.sender.equals(0)){
            val user_message = getUserLayout()
            holder.linear_layout.addView(user_message)
            val message_et = user_message?.findViewById<TextView>(R.id.message_tv_user)
            message_et?.setText(message.message)

        }else if(message.sender.equals(1)){
            val bot_message = getBotLayout()
            holder.linear_layout.addView(bot_message)
            val message_et = bot_message?.findViewById<TextView>(R.id.message_tv_user)
            message_et?.setText(message.message)
        }
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    fun getUserLayout(): FrameLayout? {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        return inflater.inflate(R.layout.user_message_box, null) as FrameLayout?
    }

    fun getBotLayout(): FrameLayout? {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        return inflater.inflate(R.layout.bot_message_box, null) as FrameLayout?
    }

    class MessageViewHolder(view:View): RecyclerView.ViewHolder(view){
        val linear_layout = view.findViewById<LinearLayout>(R.id.linear_layout)
    }
}