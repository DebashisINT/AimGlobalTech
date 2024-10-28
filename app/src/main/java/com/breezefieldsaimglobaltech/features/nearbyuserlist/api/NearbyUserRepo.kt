package com.breezefieldsaimglobaltech.features.nearbyuserlist.api

import com.breezefieldsaimglobaltech.app.Pref
import com.breezefieldsaimglobaltech.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsaimglobaltech.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsaimglobaltech.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}