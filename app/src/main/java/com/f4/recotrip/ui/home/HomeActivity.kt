package com.f4.recotrip.ui.home

import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import androidx.drawerlayout.widget.DrawerLayout
import com.f4.recotrip.R

class HomeActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var btnMenu: ImageButton
    private lateinit var btnStart: Button
    private lateinit var btnCheckPlan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.navigation_view)
        btnMenu = findViewById(R.id.btnMenu)
        btnStart = findViewById(R.id.btnStart)


        // 햄버거 메뉴 열기
        btnMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.END)
        }

        // 출발하기 버튼
        btnStart.setOnClickListener {
            Toast.makeText(this, "출발 준비 중입니다!!", Toast.LENGTH_SHORT).show()
            // TODO: 여행 추천 화면으로 이동
        }


        // 네비게이션 메뉴 클릭 처리
        navigationView.setNavigationItemSelectedListener { menuItem ->
            handleNavigationItem(menuItem)
            true
        }
    }

    private fun handleNavigationItem(item: MenuItem) {
        when (item.itemId) {
            R.id.nav_plan -> {
                Toast.makeText(this, "내 플랜 선택", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_board -> {
                Toast.makeText(this, "게시판 선택", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_profile -> {
                Toast.makeText(this, "내 정보 선택", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_privacy -> {
                Toast.makeText(this, "개인정보 보기", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_logout -> {
                Toast.makeText(this, "로그아웃 합니다", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.END)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
            drawerLayout.closeDrawer(GravityCompat.END)
        } else {
            super.onBackPressed()
        }
    }
}
