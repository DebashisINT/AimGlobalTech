package com.breezefieldsaimglobaltech.app.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.breezefieldsaimglobaltech.app.AppConstant

@Entity(tableName = AppConstant.ENTITY_LIST_TABLE)
class EntityTypeEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "entity_id")
    var entity_id: String? = null

    @ColumnInfo(name = "name")
    var name: String? = null
}