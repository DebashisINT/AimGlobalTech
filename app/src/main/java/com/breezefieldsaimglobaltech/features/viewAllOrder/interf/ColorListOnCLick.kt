package com.breezefieldsaimglobaltech.features.viewAllOrder.interf

import com.breezefieldsaimglobaltech.app.domain.NewOrderGenderEntity
import com.breezefieldsaimglobaltech.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}