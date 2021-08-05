package com.huawei.core.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Mustafa Kemal Özdemir on 8/5/2021
 */
abstract class BaseActivity:  AppCompatActivity(), BaseView {

    override fun showProgress(message: String) {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

    override fun showToast(message: String, length: Int) {
        Toast.makeText(this, message, length).show()
    }

    override fun showToast(resource: Int, length: Int) {
        showToast(getString(resource))
    }
}