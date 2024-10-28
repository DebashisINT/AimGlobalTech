package com.breezefieldsaimglobaltech.features.weather.api

import com.breezefieldsaimglobaltech.features.task.api.TaskApi
import com.breezefieldsaimglobaltech.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}