package com.breezefieldsaimglobaltech.features.stockCompetetorStock.api

import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsaimglobaltech.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsaimglobaltech.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}