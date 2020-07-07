package com.example.englishvocabularies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnConvertview1.setOnClickListener {
            var intent : Intent = Intent(this@MainActivity,RelativeActivity::class.java)
            startActivity(intent)
        }
    }
}
