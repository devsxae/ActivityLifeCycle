package com.example.activitylifecycle

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnCreate() was called")
    }

    override fun onStart() {
        super.onStart();
        Log.i(TAG,"OnStart() was called")
    }
    override fun onPause() {
        super.onPause();
        Log.i(TAG,"OnPause() was called")
    }
    override fun onStop() {
        super.onStop();
        Log.i(TAG,"OnStop() was called")
    }
    override fun onResume() {
        super.onResume();
        Log.i(TAG,"OnResume() was called")
    }
}