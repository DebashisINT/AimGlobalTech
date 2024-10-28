package com.breezefieldsaimglobaltech.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsaimglobaltech.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsaimglobaltech.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}