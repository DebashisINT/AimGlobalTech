package com.breezefieldsaimglobaltech.features.dashboard.presentation.api.submithomeloc

import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.dashboard.presentation.model.SubmitHomeLocationInputModel
import io.reactivex.Observable

/**
 * Created by Saikat on 13-03-2019.
 */
class SubmitHomeLocationRepo(val apiService: SubmitHomeLocationApi) {
    fun submitAttendance(addAttendenceModel: SubmitHomeLocationInputModel): Observable<BaseResponse> {
        return apiService.submitHomeLocation(addAttendenceModel)
    }
}