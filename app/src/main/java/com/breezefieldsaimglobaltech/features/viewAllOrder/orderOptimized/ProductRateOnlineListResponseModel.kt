package com.breezefieldsaimglobaltech.features.viewAllOrder.orderOptimized

import com.breezefieldsaimglobaltech.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}