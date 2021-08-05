package com.huawei.core.navigation

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavOptions

/**
 * Created by Mustafa Kemal Özdemir on 8/5/2021
 */
sealed class NavigationCommand {
    data class ToDirection(
        @IdRes val actionId: Int,
        val arguments: Bundle? = null,
        val navOptions: NavOptions? = null
    ) : NavigationCommand()

    data class ToDeepLink(val deepLink: String) : NavigationCommand()

    //todo popup can be added
    object Back : NavigationCommand()
}