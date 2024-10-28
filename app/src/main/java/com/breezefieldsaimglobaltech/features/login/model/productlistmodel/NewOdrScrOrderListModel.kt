package com.breezefieldsaimglobaltech.features.login.model.productlistmodel

import com.breezefieldsaimglobaltech.app.domain.NewOrderScrOrderEntity
import com.breezefieldsaimglobaltech.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}