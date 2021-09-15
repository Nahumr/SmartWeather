package com.example.smartweather.presenter.contract;

import com.example.smartweather.dto.network.response.ClimateResponse;

public interface IMainPresenter {

    interface view{
        void waitingProcess();
        void processCompleted();
        void populateView(ClimateResponse result);
        void showError(String menssage, String codigo);
    }

    interface model{
        ClimateResponse getClimate(String zip);
    }

    interface presenter{
        ClimateResponse getClimate(String zip);
        void waitingProcess();
        void processCompleted();
        void populateView(ClimateResponse result);
        void showError(String menssage, String codigo);
    }

}
