package com.f4.recotrip.ui.board

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.f4.recotrip.R

class CommunityPostActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PostAdapter
    private val posts = mutableListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_community_post)

        val cityName = intent.getStringExtra("cityName") ?: "Unknown"
        val titleText = findViewById<TextView>(R.id.textViewSelectedCity)
        recyclerView = findViewById(R.id.recyclerViewPosts)

        titleText.text = "$cityName 관련 게시글"
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = PostAdapter(posts)
        recyclerView.adapter = adapter

        loadDummyPosts(cityName)
    }

    private fun loadDummyPosts(city: String) {
        posts.clear()

        // 더미 데이터 추가
        posts.add(Post("맛집 추천 부탁해요", "$city 에 있는 숨은 맛집 아시는 분?", "user1", city))
        posts.add(Post("호텔 후기 공유", "$city 중심가 근처 호텔 괜찮은 데 있었어요.", "user2", city))
        posts.add(Post("날씨 어떤가요?", "$city 요즘 비 자주 오나요?", "user3", city))
        posts.add(Post("여행 일정 공유해요", "$city 여행 플랜 이렇게 짰어요~", "user4", city))
        posts.add(Post("교통편 문의", "$city 가는 가장 빠른 방법 뭐가 있을까요?", "user5", city))

        adapter.notifyDataSetChanged()
    }
}
