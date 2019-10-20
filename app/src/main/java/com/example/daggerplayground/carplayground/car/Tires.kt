package com.example.daggerplayground.carplayground.car

import android.util.Log
import com.example.daggerplayground.info.CAR_LOG_TAG

class Tires {
    //imagine that we don't own this class so we can't annotate it with @Inject

    fun inflate() {
        Log.d(CAR_LOG_TAG, "Tires inflated")
    }
}