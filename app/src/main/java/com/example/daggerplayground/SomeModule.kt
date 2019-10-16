package com.example.daggerplayground

import dagger.Module
import dagger.Provides

@Module
class SomeModule {
    @Provides
    fun providesInfo(): Info {
        return Info("some text")
    }
}