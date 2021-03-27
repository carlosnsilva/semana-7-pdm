package com.example.semana_7

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val intent = Intent(context, MainActivity::class.java)
        context.startActivities(arrayOf(intent))

        Toast.makeText(context, "Deu certo a notificacao", Toast.LENGTH_SHORT).show()
        Log.i("MENSAGEM => ","Deu certo")
    }
}