package com.f4.recotrip.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.f4.recotrip.R
import com.f4.recotrip.ui.home.HomeActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_activity_login)

        val auth = Firebase.auth
        val prefs = getSharedPreferences("loginPrefs", MODE_PRIVATE)
        val emailInput = findViewById<EditText>(R.id.email_input)
        val passwordInput = findViewById<EditText>(R.id.password_input)
        val signupButton = findViewById<Button>(R.id.signup_button)
        val loginButton = findViewById<Button>(R.id.login_button)
        val rememberCheckBox = findViewById<CheckBox>(R.id.checkbox_remember)
        val forgotPasswordText = findViewById<TextView>(R.id.forgot_password_text)

        // 불러오기
        emailInput.setText(prefs.getString("email", ""))
        passwordInput.setText(prefs.getString("password", ""))
        rememberCheckBox.isChecked = prefs.getBoolean("remember", false)

        signupButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "회원가입 성공!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "회원가입 실패: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (rememberCheckBox.isChecked) {
                prefs.edit()
                    .putString("email", email)
                    .putString("password", password)
                    .putBoolean("remember", true)
                    .apply()
            } else {
                prefs.edit().clear().apply()
            }

            loginUser(auth, email, password)
        }

        forgotPasswordText.setOnClickListener {
            Toast.makeText(this, "비밀번호 재설정 기능은 아직 준비 중입니다.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loginUser(auth: FirebaseAuth, email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "로그인 실패: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}