package com.restservice.POJO;

public class Bitcoin {
    private String disclaimer;
    private String rate;

    public Bitcoin(String disclaimer, String rate) {
        this.disclaimer = disclaimer;
        this.rate = rate;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public String getRate() {
        return rate;
    }
}