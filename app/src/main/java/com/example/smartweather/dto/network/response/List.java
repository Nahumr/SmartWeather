
package com.example.smartweather.dto.network.response;

import com.google.gson.annotations.SerializedName;

public class List {

    @SerializedName("clouds")
    private Long mClouds;
    @SerializedName("deg")
    private Long mDeg;
    @SerializedName("dt")
    private Long mDt;
    @SerializedName("feels_like")
    private FeelsLike mFeelsLike;
    @SerializedName("humidity")
    private Long mHumidity;
    @SerializedName("pressure")
    private Long mPressure;
    @SerializedName("rain")
    private Double mRain;
    @SerializedName("speed")
    private Double mSpeed;
    @SerializedName("sunrise")
    private Long mSunrise;
    @SerializedName("sunset")
    private Long mSunset;
    @SerializedName("temp")
    private Temp mTemp;
    @SerializedName("weather")
    private java.util.List<Weather> mWeather;

    public Long getClouds() {
        return mClouds;
    }

    public void setClouds(Long clouds) {
        mClouds = clouds;
    }

    public Long getDeg() {
        return mDeg;
    }

    public void setDeg(Long deg) {
        mDeg = deg;
    }

    public Long getDt() {
        return mDt;
    }

    public void setDt(Long dt) {
        mDt = dt;
    }

    public FeelsLike getFeelsLike() {
        return mFeelsLike;
    }

    public void setFeelsLike(FeelsLike feelsLike) {
        mFeelsLike = feelsLike;
    }

    public Long getHumidity() {
        return mHumidity;
    }

    public void setHumidity(Long humidity) {
        mHumidity = humidity;
    }

    public Long getPressure() {
        return mPressure;
    }

    public void setPressure(Long pressure) {
        mPressure = pressure;
    }

    public Double getRain() {
        return mRain;
    }

    public void setRain(Double rain) {
        mRain = rain;
    }

    public Double getSpeed() {
        return mSpeed;
    }

    public void setSpeed(Double speed) {
        mSpeed = speed;
    }

    public Long getSunrise() {
        return mSunrise;
    }

    public void setSunrise(Long sunrise) {
        mSunrise = sunrise;
    }

    public Long getSunset() {
        return mSunset;
    }

    public void setSunset(Long sunset) {
        mSunset = sunset;
    }

    public Temp getTemp() {
        return mTemp;
    }

    public void setTemp(Temp temp) {
        mTemp = temp;
    }

    public java.util.List<Weather> getWeather() {
        return mWeather;
    }

    public void setWeather(java.util.List<Weather> weather) {
        mWeather = weather;
    }

}
