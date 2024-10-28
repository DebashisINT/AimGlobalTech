package com.breezefieldsaimglobaltech.features.survey.api

import com.breezefieldsaimglobaltech.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsaimglobaltech.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}