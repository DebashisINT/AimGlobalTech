package com.breezefieldsaimglobaltech.features.location.api

import com.breezefieldsaimglobaltech.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsaimglobaltech.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}