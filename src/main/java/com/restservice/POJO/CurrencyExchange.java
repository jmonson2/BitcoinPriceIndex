package com.restservice.POJO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyExchange {
    private double CAD;
    private double HKD;
    private double ISK;
    private double PHP;
    private double DKK;
    private double HUF;
    private double CZK;
    private double AUD;
    private double RON;
    private double SEK;
    private double IDR;
    private double INR;
    private double BRL;
    private double RUB;
    private double HRK;
    private double JPY;
    private double THB;
    private double CHF;
    private double SGD;
    private double PLN;
    private double BGN;
    private double TRY;
    private double CNY;
    private double NOK;
    private double NZD;
    private double ZAR;
    private double MXN;
    private double ILS;
    private double KRW;
    private double MYR;

    public CurrencyExchange() {

    }

    public CurrencyExchange(double CAD, double HKD, double ISK, double PHP, double DKK, double HUF, double CZK,
                            double AUD, double RON, double SEK, double IDR, double INR, double BRL, double RUB,
                            double HRK, double JPY, double THB, double CHF, double SGD, double PLN, double BGN,
                            double TRY, double CNY, double NOK, double NZD, double ZAR, double MXN, double ILS,
                            double KRW, double MYR) {
        this.CAD = CAD;
        this.HKD = HKD;
        this.ISK = ISK;
        this.PHP = PHP;
        this.DKK = DKK;
        this.HUF = HUF;
        this.CZK = CZK;
        this.AUD = AUD;
        this.RON = RON;
        this.SEK = SEK;
        this.IDR = IDR;
        this.INR = INR;
        this.BRL = BRL;
        this.RUB = RUB;
        this.HRK = HRK;
        this.JPY = JPY;
        this.THB = THB;
        this.CHF = CHF;
        this.SGD = SGD;
        this.PLN = PLN;
        this.BGN = BGN;
        this.TRY = TRY;
        this.CNY = CNY;
        this.NOK = NOK;
        this.NZD = NZD;
        this.ZAR = ZAR;
        this.MXN = MXN;
        this.ILS = ILS;
        this.KRW = KRW;
        this.MYR = MYR;
    }
}