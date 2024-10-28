package com.breezefieldsaimglobaltech.features.weather.api

import com.breezefieldsaimglobaltech.base.BaseResponse
import com.breezefieldsaimglobaltech.features.task.api.TaskApi
import com.breezefieldsaimglobaltech.features.task.model.AddTaskInputModel
import com.breezefieldsaimglobaltech.features.weather.model.ForeCastAPIResponse
import com.breezefieldsaimglobaltech.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}