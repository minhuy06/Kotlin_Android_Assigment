package com.example.kotlin_android_assiment

import android.widget.TextView

class SinhVien(
    val hoTen: String,
    val mssv: String,
    val lop: String,
    val nganh: String
) {
    fun HienThi(
        tvName: TextView,
        tvId: TextView,
        tvClass: TextView,
        tvMajor: TextView
    ) {
        tvName.text = "Họ và tên: $hoTen"
        tvId.text = "MSSV: $mssv"
        tvClass.text = "Lớp: $lop"
        tvMajor.text = "Ngành: $nganh"
    }
}