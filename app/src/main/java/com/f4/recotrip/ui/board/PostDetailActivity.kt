package com.f4.recotrip.ui.board


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.f4.recotrip.ui.board.CommentAdapter
import com.f4.recotrip.R

class PostDetailActivity : AppCompatActivity() {
    private lateinit var commentAdapter: CommentAdapter
    private val comments = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_detail)

        val titleView = findViewById<TextView>(R.id.detail_title)
        val contentView = findViewById<TextView>(R.id.detail_content)
        val authorView = findViewById<TextView>(R.id.detail_author)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewComments)
        val inputComment = findViewById<EditText>(R.id.editTextComment)
        val btnAddComment = findViewById<Button>(R.id.buttonAddComment)

        // 인텐트 데이터 받기
        titleView.text = intent.getStringExtra("title")
        contentView.text = intent.getStringExtra("content")
        authorView.text = "작성자: ${intent.getStringExtra("author")}" // author 표시

        // 댓글 리사이클러뷰 세팅
        recyclerView.layoutManager = LinearLayoutManager(this)
        commentAdapter = CommentAdapter(comments)
        recyclerView.adapter = commentAdapter

        btnAddComment.setOnClickListener {
            val text = inputComment.text.toString().trim()
            if (text.isNotEmpty()) {
                comments.add(text)
                commentAdapter.notifyItemInserted(comments.size - 1)
                inputComment.text.clear()
                recyclerView.scrollToPosition(comments.size - 1)
            }
        }
    }
}