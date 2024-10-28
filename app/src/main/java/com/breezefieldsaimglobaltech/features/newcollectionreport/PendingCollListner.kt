package com.breezefieldsaimglobaltech.features.newcollectionreport

import com.breezefieldsaimglobaltech.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}