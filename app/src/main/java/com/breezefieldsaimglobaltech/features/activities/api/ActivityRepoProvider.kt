package com.breezefieldsaimglobaltech.features.activities.api

import com.breezefieldsaimglobaltech.features.member.api.TeamApi
import com.breezefieldsaimglobaltech.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}