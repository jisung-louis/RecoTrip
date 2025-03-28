package com.f4.recotrip.ui.board

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

import com.f4.recotrip.R

class CitySelectActivity : AppCompatActivity() {
    private val recommendedCities = listOf("베이징", "도쿄", "뉴욕", "런던", "파리")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_select)

        val layout = findViewById<LinearLayout>(R.id.layoutRecommendedCities)
        val searchBtn = findViewById<Button>(R.id.buttonSearch)
        val searchInput = findViewById<EditText>(R.id.editTextCitySearch)

        // 추천 도시 버튼 동적 추가
        recommendedCities.forEach { city ->
            val button = Button(this).apply {
                text = city
                setOnClickListener { goToCommunityPost(city) }
            }
            layout.addView(button)
        }

        searchBtn.setOnClickListener {
            val city = searchInput.text.toString().trim()
            if (city.isNotEmpty()) goToCommunityPost(city)
        }
    }

    private fun goToCommunityPost(city: String) {
        val intent = Intent(this, CommunityPostActivity::class.java)
        intent.putExtra("cityName", city)
        startActivity(intent)
    }
}