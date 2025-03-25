// 내 플랜 생성

package com.f4.recotrip.ui.plan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.f4.recotrip.R
import com.f4.recotrip.ui.plan.fragment.KeywordFragment

class PlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.plan_activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, KeywordFragment())
            .commit()
    }
}