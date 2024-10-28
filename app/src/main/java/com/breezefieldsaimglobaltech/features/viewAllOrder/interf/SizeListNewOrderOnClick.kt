package com.breezefieldsaimglobaltech.features.viewAllOrder.interf

import com.breezefieldsaimglobaltech.app.domain.NewOrderProductEntity
import com.breezefieldsaimglobaltech.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}