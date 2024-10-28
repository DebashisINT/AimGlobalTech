package com.breezefieldsaimglobaltech.features.location.api

import com.breezefieldsaimglobaltech.app.Pref
import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.location.model.AppInfoInputModel
import com.breezefieldsaimglobaltech.features.location.model.AppInfoResponseModel
import com.breezefieldsaimglobaltech.features.location.model.GpsNetInputModel
import com.breezefieldsaimglobaltech.features.location.model.ShopDurationRequest
import com.breezefieldsaimglobaltech.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}