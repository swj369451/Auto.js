package com.stardust.auojs.inrt.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.text.TextUtils
import androidx.core.content.ContextCompat
import com.stardust.auojs.inrt.SplashActivity

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent == null) return
        if (TextUtils.equals(intent.action, "android.intent.action.BOOT_COMPLETED")) {
            val newIntent = Intent(context, SplashActivity::class.java)
            ContextCompat.startActivity(context, newIntent, null)
        }
    }
}