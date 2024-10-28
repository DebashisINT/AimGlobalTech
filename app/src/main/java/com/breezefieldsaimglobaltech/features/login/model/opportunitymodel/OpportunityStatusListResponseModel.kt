package com.breezefieldsaimglobaltech.features.login.model.opportunitymodel

import com.breezefieldsaimglobaltech.app.domain.OpportunityStatusEntity
import com.breezefieldsaimglobaltech.app.domain.ProductListEntity
import com.breezefieldsaimglobaltech.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}