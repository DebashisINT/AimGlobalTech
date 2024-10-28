package com.breezefieldsaimglobaltech.features.viewAllOrder.model

import com.breezefieldsaimglobaltech.app.domain.NewOrderColorEntity
import com.breezefieldsaimglobaltech.app.domain.NewOrderGenderEntity
import com.breezefieldsaimglobaltech.app.domain.NewOrderProductEntity
import com.breezefieldsaimglobaltech.app.domain.NewOrderSizeEntity
import com.breezefieldsaimglobaltech.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

