package com.huawei.splash.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.huawei.core.base.BaseFragment
import com.huawei.core.data.TestProvider
import com.huawei.splash.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Mustafa Kemal Özdemir on 8/3/2021
 */
@AndroidEntryPoint
class SplashScreenFragment: BaseFragment<SplashScreenViewModel>() {
    @Inject
    lateinit var testProvider: TestProvider

    companion object {
        const val TAG = "SplashScreenFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onSetup(view: View) {
        Timber.v(testProvider.test())
        viewModel.testVM()
    }

    override fun initializeView(view: View) {

    }


}