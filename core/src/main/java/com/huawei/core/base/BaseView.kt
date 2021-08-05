package com.huawei.core.base

import android.widget.Toast
import androidx.annotation.StringRes

interface BaseView {
    fun showProgress(message: String = "")
    fun hideProgress()
    fun showToast(message: String, length: Int = Toast.LENGTH_LONG)
    fun showToast(@StringRes resource: Int, length: Int = Toast.LENGTH_LONG)
}