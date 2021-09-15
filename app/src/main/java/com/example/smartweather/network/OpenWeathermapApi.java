package com.example.smartweather.network;

import com.example.smartweather.dto.network.response.ClimateResponse;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface OpenWeathermapApi {


    @GET("forecast/climate")
    public Call<ClimateResponse> getClimate (@QueryMap HashMap<String, Object> parametros);


}
