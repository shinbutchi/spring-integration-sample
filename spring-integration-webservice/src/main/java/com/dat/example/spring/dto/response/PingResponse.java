package com.dat.example.spring.dto.response;

import java.io.Serializable;

public class PingResponse implements Serializable {

    private static final long serialVersionUID = -2188211621999973422L;
    private String pingValue;

    public PingResponse(String pingValue) {
        this.pingValue = pingValue;
    }

    public String getPingValue() {
        return pingValue;
    }

    public void setPingValue(String pingValue) {
        this.pingValue = pingValue;
    }
}
