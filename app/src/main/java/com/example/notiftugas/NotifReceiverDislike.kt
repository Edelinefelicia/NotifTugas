package com.example.notiftugas

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class NotifReceiverDislike : BroadcastReceiver() {
    override fun onReceive(p0: Context?, p1: Intent?) {
        val objmaindislike = MainActivity()
        if(MainActivity.numberdislike!=null) {
            MainActivity.numberdislike++
            MainActivity.binding.tvDislikenum.text = MainActivity.numberdislike.toString()
        }
    }

}