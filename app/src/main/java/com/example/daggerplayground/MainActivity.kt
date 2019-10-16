package com.example.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
    @field:Named(FIRST_INFO)
    lateinit var firstInfo: Info

    @Inject
    @field:Named(SECOND_INFO)
    lateinit var secondInfo: Info


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerInfoComponent.create().poke(this)
        textView.text = firstInfo.text + ", " + secondInfo.text
    }
}