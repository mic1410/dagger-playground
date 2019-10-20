package com.example.daggerplayground.carplayground.dagger

import com.example.daggerplayground.carplayground.car.Wheels
import com.example.daggerplayground.carplayground.car.Tires
import com.example.daggerplayground.carplayground.car.Rims
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate() //run some example method
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}