package com.huawei.core.di

import com.huawei.core.data.TestProvider
import com.huawei.core.data.TestProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
Created by Mustafa Kemal ÖZDEMİR on 4.08.2021
 */
@Module
@InstallIn(SingletonComponent::class)
object CoreModule {

    @Singleton
    @Provides
    fun provideTestProvider(provide: TestProviderImpl): TestProvider = provide

}