package com.andresoller.myapplication3.authentication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.andresoller.myapplication3.R
import com.andresoller.myapplication3.home.HomeActivity


class AuthenticationActivity : AppCompatActivity(), FragmentActionsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        onNavigateToLogin()
    }

    override fun onNavigateToLogin() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, LoginFragment())
            .commit()
    }

    override fun onNavigateToRegister() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RegistrationFragment())
            .commit()
    }

    override fun onNavigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}