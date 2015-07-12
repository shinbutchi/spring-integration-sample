package com.dat.example.spring.dto.request;

import java.io.Serializable;

public class PingRequest implements Serializable {

    private static final long serialVersionUID = -1972835015161395579L;
    private String pingValue;

    public String getPingValue() {
        return pingValue;
    }

    public void setPingValue(String pingValue) {
        this.pingValue = pingValue;
    }
}
