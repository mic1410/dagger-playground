package com.example.daggerplayground

import javax.inject.Inject

class Info @Inject constructor() {
    val text = "Hello Dagger 2"
}