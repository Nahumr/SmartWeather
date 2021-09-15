package com.example.smartweather.model.contract;

import com.example.smartweather.dto.network.response.ClimateResponse;

public interface IOpenWeathermapApiCall {

    ClimateResponse getClimate(String zip);

}
