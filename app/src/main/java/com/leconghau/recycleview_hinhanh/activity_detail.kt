package com.leconghau.recycleview_hinhanh

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class activity_detail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val phim = intent.getSerializableExtra("film") as Phim
        val imgPhimHH = findViewById<ImageView>(R.id.imgPhimHH)
        imgPhimHH.setImageResource(phim.hinh)
        val tvNoiDung = findViewById<TextView>(R.id.tvNoidung)
        tvNoiDung.text = phim.tomtat
        val tvTenPhimHH = findViewById<TextView>(R.id.tvTenPhimHH)
        tvTenPhimHH.text = phim.tenPhim
    }
}