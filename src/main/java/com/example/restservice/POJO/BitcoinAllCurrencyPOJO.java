package com.example.restservice.POJO;

public class BitcoinAllCurrencyPOJO {
    private String disclaimer;
    private String rateUSD;
    private String rateEUR;
    private String rateGBP;

    public BitcoinAllCurrencyPOJO(String disclaimer, String priceUSD, String priceEUR, String priceGBP) {
        this.disclaimer = disclaimer;
        this.rateUSD = priceUSD;
        this.rateEUR = priceEUR;
        this.rateGBP = priceGBP;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public String getRateUSD() {
        return rateUSD;
    }

    public String getRateEUR() {
        return rateEUR;
    }

    public String getRateGBP() {
        return rateGBP;
    }
}
