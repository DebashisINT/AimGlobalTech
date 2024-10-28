package com.breezefieldsaimglobaltech.features.stockAddCurrentStock.api

import com.breezefieldsaimglobaltech.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsaimglobaltech.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}