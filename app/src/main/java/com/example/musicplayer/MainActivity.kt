package com.example.musicplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var logo:ImageView
    private lateinit var label:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        init()

    }

    private fun init(){
        logo=findViewById(R.id.app_logo)
        label=findViewById(R.id.app_textlabel)

        performAnimation()

    }

    private fun performAnimation(){
        val logoanimation : Animation=AnimationUtils.loadAnimation(applicationContext,R.anim.logo_anim)
        val applabelanimation : Animation =AnimationUtils.loadAnimation(applicationContext,R.anim.app_label_anim)

        label.startAnimation(applabelanimation)
        logo.startAnimation(logoanimation)

    }
}