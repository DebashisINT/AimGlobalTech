package com.breezefieldsaimglobaltech.features.viewAllOrder.interf

import com.breezefieldsaimglobaltech.app.domain.NewOrderColorEntity
import com.breezefieldsaimglobaltech.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}