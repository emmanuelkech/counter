package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private var mCount = 0

    companion object{
        const val TAG = "actions"
//        const val COUNT = "rotate"
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        Log.d(TAG,"onCreate is called")
        setContentView(binding.root)

        val click:TextView = binding.countValue
        val plusButton:Button = binding.increaseButton
        val minusButton:Button = binding.decreaseButton

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        click.text = viewModel.mCount.toString()

        minusButton.setOnClickListener {
            viewModel.subtractNumber()
            click.text = viewModel.mCount.toString()
        }

        plusButton.setOnClickListener {
            viewModel.addNumber()
            click.text = viewModel.mCount.toString()
        }
    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        mCount = savedInstanceState.getInt(COUNT,0)
//        val click1 = binding.countValue
//        click1.text = mCount.toString()
//    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putInt(COUNT,mCount)
//        Log.d(TAG,"onSaveInstance called")
//    }

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
}