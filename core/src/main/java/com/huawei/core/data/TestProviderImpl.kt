package com.huawei.core.data

import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 4.08.2021
 */
class TestProviderImpl @Inject constructor(): TestProvider {
    override fun test(): String {
        return "Success"
    }
}