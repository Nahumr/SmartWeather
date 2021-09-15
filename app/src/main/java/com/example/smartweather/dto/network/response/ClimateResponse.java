
package com.example.smartweather.dto.network.response;

import com.google.gson.annotations.SerializedName;

public class ClimateResponse  extends  BaseHttpResponse{

    @SerializedName("city")
    private City mCity;
    @SerializedName("cod")
    private String mCod;
    @SerializedName("list")
    private java.util.List<com.example.smartweather.dto.network.response.List> mList;
    @SerializedName("message")
    private Double mMessage;

    public City getCity() {
        return mCity;
    }

    public void setCity(City city) {
        mCity = city;
    }

    public String getCod() {
        return mCod;
    }

    public void setCod(String cod) {
        mCod = cod;
    }

    public java.util.List<com.example.smartweather.dto.network.response.List> getList() {
        return mList;
    }

    public void setList(java.util.List<com.example.smartweather.dto.network.response.List> list) {
        mList = list;
    }

    public Double getMessage() {
        return mMessage;
    }

    public void setMessage(Double message) {
        mMessage = message;
    }

}
