package com.breezefieldsaimglobaltech.features.photoReg.present

import com.breezefieldsaimglobaltech.app.domain.ProspectEntity
import com.breezefieldsaimglobaltech.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}