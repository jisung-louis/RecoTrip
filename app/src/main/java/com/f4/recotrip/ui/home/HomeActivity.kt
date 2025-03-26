package com.f4.recotrip.ui.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.f4.recotrip.R
import com.f4.recotrip.ui.plan.PlanActivity
import com.f4.recotrip.ui.auth.LoginActivity
import com.f4.recotrip.ui.board.BoardActivity
import com.f4.recotrip.ui.settings.SettingsActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_main)

        // 예시: 추천 화면으로 이동하는 버튼
        val btnGoToRecommendation = findViewById<Button>(R.id.btn_recommend)
        btnGoToRecommendation.setOnClickListener {
            startActivity(Intent(this, PlanActivity::class.java))
        }

        val btnLogin = findViewById<Button>(R.id.btn_login)
        btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        val btnCommunity = findViewById<Button>(R.id.btn_community)
        btnCommunity.setOnClickListener {
            startActivity(Intent(this, BoardActivity::class.java))
        }

        val btnSettings = findViewById<Button>(R.id.btn_settings)
        btnSettings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }

        // 다른 화면도 마찬가지로 버튼 만들 수 있어요
    }

    override fun onBackPressed() {
        finishAffinity() // 앱 완전 종료
    }
}