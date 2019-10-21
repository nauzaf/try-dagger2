package com.wepe.trydagger.di.module

import android.app.Application
import android.content.Context
import com.wepe.trydagger.utils.CoroutinesAppProvider
import com.wepe.trydagger.utils.CoroutinesContextProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {
    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideCoroutineContextProvider() : CoroutinesContextProvider{
        return CoroutinesAppProvider()
    }
}