package com.example.daggerplayground.carplayground.dagger

import com.example.daggerplayground.carplayground.CarActivity
import dagger.Component
import com.example.daggerplayground.carplayground.car.Car

@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun getCar(): Car

    fun inject(carActivity: CarActivity)
}
