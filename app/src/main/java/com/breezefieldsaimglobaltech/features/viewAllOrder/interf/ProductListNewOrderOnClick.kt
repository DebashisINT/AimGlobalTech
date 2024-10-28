package com.breezefieldsaimglobaltech.features.viewAllOrder.interf

import com.breezefieldsaimglobaltech.app.domain.NewOrderGenderEntity
import com.breezefieldsaimglobaltech.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}