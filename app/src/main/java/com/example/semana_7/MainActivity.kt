package com.example.semana_7

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var IF_receiver: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.IF_receiver = MyReceiver()
        val intent_filter = IntentFilter()
        intent_filter.addAction(Intent.ACTION_BOOT_COMPLETED)
        registerReceiver(this.IF_receiver, intent_filter)
    }

    /*
    override fun onStart() {
        super.onStart()
        val intent_filter = IntentFilter()
        intent_filter.addAction(Intent.ACTION_BOOT_COMPLETED)
        registerReceiver(this.IF_receiver, intent_filter)
    }
     */

}