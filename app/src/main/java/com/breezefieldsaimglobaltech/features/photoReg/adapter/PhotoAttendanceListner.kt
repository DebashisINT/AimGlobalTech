package com.breezefieldsaimglobaltech.features.photoReg.adapter

import com.breezefieldsaimglobaltech.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}