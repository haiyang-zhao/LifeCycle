package com.zhy.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zhy.lifecycle.view.GoodsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun testMvp(view: View) {
        startActivity(Intent(this, GoodsActivity::class.java))
    }
}