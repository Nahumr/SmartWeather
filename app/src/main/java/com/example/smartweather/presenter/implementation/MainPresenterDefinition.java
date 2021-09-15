package com.example.smartweather.presenter.implementation;

import com.example.smartweather.dto.network.response.ClimateResponse;
import com.example.smartweather.model.implementation.CallOpenWeatRetrofit;
import com.example.smartweather.presenter.contract.IMainPresenter;

public class MainPresenterDefinition implements IMainPresenter.presenter {

    private IMainPresenter.view view;
    private IMainPresenter.model model;

    public MainPresenterDefinition(IMainPresenter.view view) {
        this.view = view;
        this.model = new CallOpenWeatRetrofit(this);
    }

    @Override
    public ClimateResponse getClimate(String zip) {
        if(model != null){
            return model.getClimate(zip);
        }
        return new ClimateResponse();
    }

    @Override
    public void waitingProcess() {
        if(view != null)
            view.waitingProcess();
    }

    @Override
    public void processCompleted() {
        if(view != null)
            view.processCompleted();
    }

    @Override
    public void populateView(ClimateResponse result) {
        if(view != null)
            view.populateView(result);
    }

    @Override
    public void showError(String menssage, String codigo) {
        if(view != null)
            view.showError(menssage,codigo);
    }
}
