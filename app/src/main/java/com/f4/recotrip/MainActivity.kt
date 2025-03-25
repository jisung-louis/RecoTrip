package com.f4.recotrip

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.f4.recotrip.ui.plan.PlanActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 예시: 추천 화면으로 이동하는 버튼
        val btnGoToRecommendation = findViewById<Button>(R.id.btn_recommend)
        btnGoToRecommendation.setOnClickListener {
            startActivity(Intent(this, PlanActivity::class.java))
        }

        // 다른 화면도 마찬가지로 버튼 만들 수 있어요
    }
}