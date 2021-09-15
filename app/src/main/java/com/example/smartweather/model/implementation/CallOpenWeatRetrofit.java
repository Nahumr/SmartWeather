package com.example.smartweather.model.implementation;

import com.example.smartweather.dto.network.response.ClimateResponse;
import com.example.smartweather.model.contract.IOpenWeathermapApiCall;
import com.example.smartweather.network.OpenWeathermapApi;
import com.example.smartweather.presenter.contract.IMainPresenter;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CallOpenWeatRetrofit implements IOpenWeathermapApiCall, IMainPresenter.model {


    private OpenWeathermapApi api;
    private IMainPresenter.presenter presenter;

    public CallOpenWeatRetrofit(IMainPresenter.presenter presenter) {
        this.presenter = presenter;
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl("https://pro.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(OpenWeathermapApi.class);
    }

    @Override
    public ClimateResponse getClimate(String zip) {
        ClimateResponse serviceResponse = new ClimateResponse();
        HashMap<String, Object> params = new HashMap<>();
        params.put("zip", zip);
        params.put("appid", "60a760c50fb7c1f2e7f7d171a0771a39");

        Call<ClimateResponse> call = api.getClimate(params);
        presenter.waitingProcess();
        call.enqueue(new Callback<ClimateResponse>() {
            @Override
            public void onResponse(Call<ClimateResponse> call, Response<ClimateResponse> response) {
                presenter.processCompleted();
                if(response.isSuccessful()){
                    presenter.populateView(response.body());
                    return;
                }else{
                    presenter.showError("No se puedo conectar con el servicio : " , String.valueOf(response.code()));
                }
            }

            @Override
            public void onFailure(Call<ClimateResponse> call, Throwable t) {
                presenter.processCompleted();
                presenter.showError("Ocurrio un error al procesar la petición : " , t.getMessage());
                return;
            }
        });
        return serviceResponse;
    }
}
