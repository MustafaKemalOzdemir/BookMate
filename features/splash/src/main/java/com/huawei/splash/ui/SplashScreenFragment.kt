package com.huawei.splash.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.huawei.core.data.TestProvider
import com.huawei.splash.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by Mustafa Kemal Özdemir on 8/3/2021
 */
@AndroidEntryPoint
class SplashScreenFragment: Fragment() {
    @Inject
    lateinit var testProvider: TestProvider
    lateinit var viewModel: SplashScreenViewModel

    companion object {
        const val TAG = "SplashScreenFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SplashScreenViewModel::class.java)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v(TAG, testProvider.test())
        viewModel.testVM()
    }

}