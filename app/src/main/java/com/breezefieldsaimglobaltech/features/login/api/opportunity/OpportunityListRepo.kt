package com.breezefieldsaimglobaltech.features.login.api.opportunity

import com.breezefieldsaimglobaltech.app.Pref
import com.breezefieldsaimglobaltech.app.utils.AppUtils
import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.addshop.model.AudioFetchDataCLass
import com.breezefieldsaimglobaltech.features.addshop.model.StockAllResponse
import com.breezefieldsaimglobaltech.features.dashboard.presentation.DashboardActivity
import com.breezefieldsaimglobaltech.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezefieldsaimglobaltech.features.login.model.productlistmodel.ProductListResponseModel
import com.breezefieldsaimglobaltech.features.orderITC.SyncDeleteOppt
import com.breezefieldsaimglobaltech.features.orderITC.SyncEditOppt
import com.breezefieldsaimglobaltech.features.orderITC.SyncOppt
import com.breezefieldsaimglobaltech.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun saveLMSModuleInfo(obj: DashboardActivity.LMSModule): Observable<BaseResponse> {
        return apiService.saveLMSModuleInfoApi(obj)
    }

    fun getAllStock(user_id: String): Observable<StockAllResponse> {
        return apiService.getAllStockApi(user_id)
    }
}