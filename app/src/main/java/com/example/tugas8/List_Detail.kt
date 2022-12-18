package com.example.tugas8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_list_detail.*

class List_Detail : AppCompatActivity() {
    @Suppress("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_detail)
        val titel = findViewById<TextView>(R.id.tv_titel)
        val deskripsi = findViewById<TextView>(R.id.tv_desc)


        val imag = intent.getIntExtra("imag",0)
        val titel1 = intent.getStringExtra("nama")
        val deskripsi1 = intent.getStringExtra("desc")

        img_list.setImageResource(imag)
        titel.text = titel1
        deskripsi.text = deskripsi1

    }
}