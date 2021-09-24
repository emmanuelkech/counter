package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    companion object{
        const val TAG = "actions"
        const val COUNT = "rotate"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate is called")
        setContentView(R.layout.activity_main)

        val click = findViewById<TextView>(R.id.countValue)

        val decrease = findViewById<Button>(R.id.decreaseButton)
            decrease.setOnClickListener {
            mCount--
                click.text = "$mCount"
        }

        val increase = findViewById<Button>(R.id.increaseButton)
            increase.setOnClickListener {
            mCount++
                click.text = "$mCount"
        }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        mCount = savedInstanceState.getInt(COUNT,0)
        val click1 = findViewById<TextView>(R.id.countValue)
        click1.text = "$mCount"
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart Called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNT,mCount)
        Log.d(TAG,"onSaveInstance called")
    }
}