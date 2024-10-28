package com.breezefieldsaimglobaltech.features.login.model.productlistmodel

import com.breezefieldsaimglobaltech.app.domain.ModelEntity
import com.breezefieldsaimglobaltech.app.domain.ProductListEntity
import com.breezefieldsaimglobaltech.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}