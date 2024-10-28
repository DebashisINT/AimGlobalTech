package com.breezefieldsaimglobaltech.features.document.api

import com.breezefieldsaimglobaltech.features.dymanicSection.api.DynamicApi
import com.breezefieldsaimglobaltech.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}