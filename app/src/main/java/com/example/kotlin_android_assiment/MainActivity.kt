package com.example.kotlin_android_assiment

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvStudentName = findViewById<TextView>(R.id.tvStudentName)
        val tvStudentID = findViewById<TextView>(R.id.tvStudentID)
        val tvClass = findViewById<TextView>(R.id.tvClass)
        val tvMajor = findViewById<TextView>(R.id.tvMajor)

        val svMe = SinhVien(
            hoTen = "Võ Minh Huy",
            mssv = "2415053122117",
            lop = "24T1",
            nganh = "Công nghệ thông tin"
        )

        svMe.HienThi(
            tvName = tvStudentName,
            tvId = tvStudentID,
            tvClass = tvClass,
            tvMajor = tvMajor
        )
    }
}