package com.example.daggerplayground

import dagger.Component

@Component
interface InfoComponent {
    fun poke(app: MainActivity)
}