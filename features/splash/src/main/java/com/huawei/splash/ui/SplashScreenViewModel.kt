package com.huawei.splash.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.huawei.core.data.TestProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Mustafa Kemal Özdemir on 8/3/2021
 */
@HiltViewModel
class SplashScreenViewModel @Inject constructor(val testProvider: TestProvider): ViewModel() {

    companion object {
        const val TAG = "SplashScreenViewModel"
    }

    fun testVM() {
        Log.v(TAG, testProvider.test())
    }

}