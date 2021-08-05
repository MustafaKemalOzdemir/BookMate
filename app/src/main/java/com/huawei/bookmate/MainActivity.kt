package com.huawei.bookmate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huawei.core.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Mustafa Kemal Özdemir on 8/3/2021
 */
@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}