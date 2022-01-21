package com.igzafer.coroutinekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import androidx.annotation.RestrictTo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var x = 0L
    var y = 0L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        GlobalScope.launch(Dispatchers.Default) {
            while (x < 500000) {
                x += 1
                withContext(Dispatchers.Main) {
                    counter.text = x.toString()
                }
            }
        }

    }



}
