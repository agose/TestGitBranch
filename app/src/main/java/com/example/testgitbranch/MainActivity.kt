package com.example.testgitbranch

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast()
        showMessage()
    }

    private fun toast(){
        Toast.makeText(this, "ini agus buat", Toast.LENGTH_LONG).show()
    }

    private fun showMessage(){
        Toast.makeText(this, "ini agus buat", Toast.LENGTH_LONG).show()
    }
}