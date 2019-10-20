package com.example.daggerplayground.carplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerplayground.R
import com.example.daggerplayground.carplayground.car.Car
import com.example.daggerplayground.carplayground.dagger.DaggerCarComponent
import javax.inject.Inject


class CarActivity : AppCompatActivity() {
    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)

        val carComponent = DaggerCarComponent.builder().build()
        carComponent.inject(this)
    }
}