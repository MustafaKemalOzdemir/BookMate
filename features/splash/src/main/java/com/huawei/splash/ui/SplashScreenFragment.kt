package com.huawei.splash.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.huawei.splash.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Mustafa Kemal Özdemir on 8/3/2021
 */
@AndroidEntryPoint
class SplashScreenFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

}