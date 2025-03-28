package com.f4.recotrip.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.f4.recotrip.R
import com.f4.recotrip.ui.home.HomeActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity_main)

        GlobalScope.launch {
            delay(1500)
            startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
            finish()
        }
    }
}
