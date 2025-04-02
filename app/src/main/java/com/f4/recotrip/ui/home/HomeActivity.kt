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
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

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
        val auth = Firebase.auth
        val currentUser = auth.currentUser

        btnLogin.text = if (currentUser == null) "로그인 / 회원가입" else "로그아웃"

        btnLogin.setOnClickListener {
            if (auth.currentUser == null) {
                startActivity(Intent(this, LoginActivity::class.java))
            } else {
                auth.signOut()
                btnLogin.text = "로그인 / 회원가입"
                recreate()
            }
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