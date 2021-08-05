package com.huawei.core.base

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.huawei.core.navigation.NavigationCommand
import timber.log.Timber
import java.lang.reflect.ParameterizedType

/**
 * Created by Mustafa Kemal Özdemir on 8/5/2021
 */
abstract class BaseFragment<VM : BaseViewModel> : Fragment(), BaseView {

    private lateinit var _baseActivity: BaseActivity

    val baseActivity: BaseActivity
        get() = _baseActivity

    private val navController by lazy {
        findNavController()
    }

    @Suppress("UNCHECKED_CAST")
    val viewModel by lazy {
        val persistentViewModelClass = (this.javaClass.genericSuperclass as ParameterizedType)
            .actualTypeArguments.first() as Class<VM>
        ViewModelProvider(this).get(persistentViewModelClass)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        _baseActivity = context as BaseActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onSetup(view)
    }

    private fun handleNavigation() {
        viewModel.navigationLiveData.observe(this) {
            when (val content = it.getContent()) {
                NavigationCommand.Back -> navController.navigateUp()
                is NavigationCommand.ToDeepLink -> navController.navigate(
                    content.deepLink.toUri(),
                    null,
                    navigationExtras
                )
                is NavigationCommand.ToDirection -> navController.navigate(
                    content.actionId,
                    content.arguments,
                    content.navOptions,
                    navigationExtras
                )
                null -> Timber.e("NavigationCommand is already consumed")
            }
        }
    }

    private val navigationExtras: FragmentNavigator.Extras = FragmentNavigatorExtras()

    abstract fun onSetup(view: View)

    abstract fun initializeView(view: View)

    fun initializeInteractions() {}

    fun initializeViewData() {}

    override fun showProgress(message: String) {
        _baseActivity.showProgress(message)
    }

    override fun hideProgress() {
        _baseActivity.hideProgress()
    }

    override fun showToast(message: String, length: Int) {
        _baseActivity.showToast(message, length)
    }

    override fun showToast(resource: Int, length: Int) {
        _baseActivity.showToast(resource, length)
    }

}