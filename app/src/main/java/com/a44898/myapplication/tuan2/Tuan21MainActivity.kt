package com.a44898.myapplication.tuan2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.a44898.myapplication.R

class Tuan21MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan21_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val txt1=findViewById<EditText>(R.id.Tuan2Txt1)
        val txt2=findViewById<EditText>(R.id.Tuan2Txt2)
        val btn1=findViewById<Button>(R.id.Tuan2Btn1)
        btn1!!.setOnClickListener {
            val i = Intent( this@Tuan21MainActivity, Tuan21MainActivityResult::class.java )
            i.putExtra("so1", txt1!!.text.toString())
            i.putExtra("so2", txt2!!.text.toString())
            startActivity(i)
        }
    }
}