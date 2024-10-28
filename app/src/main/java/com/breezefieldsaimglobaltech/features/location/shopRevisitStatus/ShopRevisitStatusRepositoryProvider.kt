package com.breezefieldsaimglobaltech.features.location.shopRevisitStatus

import com.breezefieldsaimglobaltech.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsaimglobaltech.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}