package com.example.weather.openweathermap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "87a83b9b394f231c0554a33b02a4bf76"

interface OpenWeatherService {

    @GET("data/2.5/weather?units=metric&lang=fr")
    fun getWeather(@Query("q") cityName: String,
    @Query("appid") apiKey: String = API_KEY) : Call<WeatherWrapper>

}