package com.example.daggerplayground.info

import dagger.Component

@Component(modules = [SomeModule::class])
interface InfoComponent {
    fun poke(app: MainActivity)
}