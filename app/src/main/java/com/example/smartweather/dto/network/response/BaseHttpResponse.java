package com.example.smartweather.dto.network.response;

public class BaseHttpResponse {
    
    protected Integer httpCodeObtained;
    protected String messageObtained;
    protected Integer codigoTransaccion;
    protected String errorTransaccion;

    public Integer getHttpCodeObtained() {
        return httpCodeObtained;
    }

    public void setHttpCodeObtained(Integer httpCodeObtained) {
        this.httpCodeObtained = httpCodeObtained;
    }

    public String getMessageObtained() {
        return messageObtained;
    }

    public void setMessageObtained(String messageObtained) {
        this.messageObtained = messageObtained;
    }

    public Integer getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(Integer codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public String getErrorTransaccion() {
        return errorTransaccion;
    }

    public void setErrorTransaccion(String errorTransaccion) {
        this.errorTransaccion = errorTransaccion;
    }
}
