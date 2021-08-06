package com.restservice.POJO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BitcoinAllCurrency {
    private String rateUSD;
    private String rateEUR;
    private String rateGBP;
    private String rateCAD;
    private String rateHKD;
    private String rateISK;
    private String ratePHP;
    private String rateDKK;
    private String rateHUF;
    private String rateCZK;
    private String rateAUD;
    private String rateRON;
    private String rateSEK;
    private String rateIDR;
    private String rateINR;
    private String rateBRL;
    private String rateRUB;
    private String rateHRK;
    private String rateJPY;
    private String rateTHB;
    private String rateCHF;
    private String rateSGD;
    private String ratePLN;
    private String rateBGN;
    private String rateTRY;
    private String rateCNY;
    private String rateNOK;
    private String rateNZD;
    private String rateZAR;
    private String rateMXN;
    private String rateILS;
    private String rateKRW;
    private String rateMYR;
    private String disclaimer;

    public BitcoinAllCurrency(String rateUSD, String rateEUR, String rateGBP, String rateCAD, String rateHKD,
                              String rateISK, String ratePHP, String rateDKK, String rateHUF, String rateCZK,
                              String rateAUD, String rateRON, String rateSEK, String rateIDR, String rateINR,
                              String rateBRL, String rateRUB, String rateHRK, String rateJPY, String rateTHB,
                              String rateCHF, String rateSGD, String ratePLN, String rateBGN, String rateTRY,
                              String rateCNY, String rateNOK, String rateNZD, String rateZAR, String rateMXN,
                              String rateILS, String rateKRW, String rateMYR, String disclaimer) {
        this.rateUSD = rateUSD;
        this.rateEUR = rateEUR;
        this.rateGBP = rateGBP;
        this.rateCAD = rateCAD;
        this.rateHKD = rateHKD;
        this.rateISK = rateISK;
        this.ratePHP = ratePHP;
        this.rateDKK = rateDKK;
        this.rateHUF = rateHUF;
        this.rateCZK = rateCZK;
        this.rateAUD = rateAUD;
        this.rateRON = rateRON;
        this.rateSEK = rateSEK;
        this.rateIDR = rateIDR;
        this.rateINR = rateINR;
        this.rateBRL = rateBRL;
        this.rateRUB = rateRUB;
        this.rateHRK = rateHRK;
        this.rateJPY = rateJPY;
        this.rateTHB = rateTHB;
        this.rateCHF = rateCHF;
        this.rateSGD = rateSGD;
        this.ratePLN = ratePLN;
        this.rateBGN = rateBGN;
        this.rateTRY = rateTRY;
        this.rateCNY = rateCNY;
        this.rateNOK = rateNOK;
        this.rateNZD = rateNZD;
        this.rateZAR = rateZAR;
        this.rateMXN = rateMXN;
        this.rateILS = rateILS;
        this.rateKRW = rateKRW;
        this.rateMYR = rateMYR;
        this.disclaimer = disclaimer;
    }
}