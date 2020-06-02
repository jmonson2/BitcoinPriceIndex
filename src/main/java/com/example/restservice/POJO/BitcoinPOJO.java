package com.example.restservice.POJO;

public class BitcoinPOJO {
    private String disclaimer;
    private String rate;

    public BitcoinPOJO(String disclaimer, String rate) {
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