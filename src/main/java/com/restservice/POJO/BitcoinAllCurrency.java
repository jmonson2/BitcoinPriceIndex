package com.restservice.POJO;

public class BitcoinAllCurrency {
    private String disclaimer;
    private String rateUSD;
    private String rateEUR;
    private String rateGBP;

    public BitcoinAllCurrency(String disclaimer, String priceUSD, String priceEUR, String priceGBP) {
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
