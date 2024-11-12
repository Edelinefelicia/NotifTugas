package com.example.notiftugas

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotifReceiverLike : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val objmainlike = MainActivity()
        if(MainActivity.numberlike!=null){
            MainActivity.numberlike++
            MainActivity.binding.tvLikenum.text = MainActivity.numberlike.toString()

        }


    }
}