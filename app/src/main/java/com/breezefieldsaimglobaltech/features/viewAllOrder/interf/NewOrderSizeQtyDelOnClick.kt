package com.breezefieldsaimglobaltech.features.viewAllOrder.interf

import com.breezefieldsaimglobaltech.app.domain.NewOrderGenderEntity
import com.breezefieldsaimglobaltech.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}