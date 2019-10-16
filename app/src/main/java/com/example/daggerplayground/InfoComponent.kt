package com.example.daggerplayground

import dagger.Component

@Component(modules = [SomeModule::class])
interface InfoComponent {
    fun poke(app: MainActivity)
}