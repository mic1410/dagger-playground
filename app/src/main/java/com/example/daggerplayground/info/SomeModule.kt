package com.example.daggerplayground.info

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class SomeModule {

    @Provides
    @Named(FIRST_INFO)
    fun provideFirstInfo(): Info {
        return Info("this is first Info!")
    }

    @Provides
    @Named(SECOND_INFO)
    fun provideSecondInfo(): Info {
        return Info("this is second Info!")
    }
}