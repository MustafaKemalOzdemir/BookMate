package com.huawei.splash.ui

import com.huawei.core.base.BaseViewModel
import com.huawei.core.data.TestProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Mustafa Kemal Özdemir on 8/3/2021
 */
@HiltViewModel
class SplashScreenViewModel @Inject constructor(private val testProvider: TestProvider): BaseViewModel() {

    companion object {
        const val TAG = "SplashScreenViewModel"
    }

    fun testVM() {
        Timber.v(testProvider.test())
    }

}