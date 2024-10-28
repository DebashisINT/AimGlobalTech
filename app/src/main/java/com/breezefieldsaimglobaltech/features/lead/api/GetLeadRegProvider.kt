package com.breezefieldsaimglobaltech.features.lead.api

import com.breezefieldsaimglobaltech.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsaimglobaltech.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}