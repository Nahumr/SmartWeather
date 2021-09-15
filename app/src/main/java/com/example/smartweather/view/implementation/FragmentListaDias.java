package com.example.smartweather.view.implementation;

import androidx.fragment.app.Fragment;

import com.example.smartweather.dto.network.response.ClimateResponse;
import com.example.smartweather.presenter.contract.IMainPresenter;
import com.example.smartweather.view.contract.IFillScreenView;

public class FragmentListaDias extends Fragment implements IMainPresenter.view, IFillScreenView {

    private IMainPresenter.presenter presenter;


    @Override
    public void waitingProcess() {

    }

    @Override
    public void processCompleted() {

    }

    @Override
    public void populateView(ClimateResponse result) {

    }

    @Override
    public void showError(String menssage, String codigo) {

    }
}
