package com.huawei.core.internal.util

/**
 * Created by Mustafa Kemal Özdemir on 8/5/2021
 */
class Event<out T>(private val content: T) {
    private var _hasBeenHandled = false

    fun getContent(): T? {
        return if(_hasBeenHandled){
            null
        }else {
            _hasBeenHandled = true
            content
        }
    }

    fun peek(): T = content
}