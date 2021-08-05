package com.huawei.core.base

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavOptions
import com.huawei.core.internal.util.Event
import com.huawei.core.navigation.NavigationCommand

/**
 * Created by Mustafa Kemal Özdemir on 8/5/2021
 */
abstract class BaseViewModel : ViewModel() {

    private val _navigationLiveData = MutableLiveData<Event<NavigationCommand>>()
    val navigationLiveData: LiveData<Event<NavigationCommand>>
        get() = _navigationLiveData

    fun navigate(@IdRes actionId: Int) {
        _navigationLiveData.value = Event(NavigationCommand.ToDirection(actionId))
    }

    fun navigate(@IdRes actionId: Int, arguments: Bundle) {
        _navigationLiveData.value = Event(NavigationCommand.ToDirection(actionId, arguments))
    }

    fun navigate(@IdRes actionId: Int, arguments: Bundle, navOptions: NavOptions) {
        _navigationLiveData.value =
            Event(NavigationCommand.ToDirection(actionId, arguments, navOptions))
    }

    fun navigateBack() {
        _navigationLiveData.value = Event(NavigationCommand.Back)
    }

}