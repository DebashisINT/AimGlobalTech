package com.breezefieldsaimglobaltech.features.mylearning.apiCall

import com.breezefieldsaimglobaltech.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsaimglobaltech.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}