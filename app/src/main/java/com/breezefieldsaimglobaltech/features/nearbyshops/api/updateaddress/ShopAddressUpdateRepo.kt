package com.breezefieldsaimglobaltech.features.nearbyshops.api.updateaddress

import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.nearbyshops.model.updateaddress.AddressUpdateRequest
import io.reactivex.Observable

/**
 * Created by Pratishruti on 05-02-2018.
 */
class ShopAddressUpdateRepo (val apiService: ShopAddressUpdateApi) {
    fun getShopAddressUpdate(shopAddressUpdate:AddressUpdateRequest): Observable<BaseResponse> {
        return apiService.getShopAddressUpdate(shopAddressUpdate)
    }
}