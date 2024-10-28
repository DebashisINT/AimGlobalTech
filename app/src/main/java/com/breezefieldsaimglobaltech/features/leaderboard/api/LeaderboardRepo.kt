package com.breezefieldsaimglobaltech.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsaimglobaltech.app.FileUtils
import com.breezefieldsaimglobaltech.app.Pref
import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.addshop.model.AddLogReqData
import com.breezefieldsaimglobaltech.features.addshop.model.AddShopRequestData
import com.breezefieldsaimglobaltech.features.addshop.model.AddShopResponse
import com.breezefieldsaimglobaltech.features.addshop.model.LogFileResponse
import com.breezefieldsaimglobaltech.features.addshop.model.UpdateAddrReq
import com.breezefieldsaimglobaltech.features.contacts.CallHisDtls
import com.breezefieldsaimglobaltech.features.contacts.CompanyReqData
import com.breezefieldsaimglobaltech.features.contacts.ContactMasterRes
import com.breezefieldsaimglobaltech.features.contacts.SourceMasterRes
import com.breezefieldsaimglobaltech.features.contacts.StageMasterRes
import com.breezefieldsaimglobaltech.features.contacts.StatusMasterRes
import com.breezefieldsaimglobaltech.features.contacts.TypeMasterRes
import com.breezefieldsaimglobaltech.features.dashboard.presentation.DashboardActivity
import com.breezefieldsaimglobaltech.features.login.model.WhatsappApiData
import com.breezefieldsaimglobaltech.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}