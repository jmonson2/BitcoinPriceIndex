package com.restservice.Constants;

public class Constants {
    public static final String USD = "USD";
    public static final String EUR = "EUR";
    public static final String GBP = "GBP";
    public static final String CAD = "CAD";
    public static final String UNSUPPORTED_CURRENCY = "Unsupported Currency";
    public static final String BPI = "bpi";
    public static final String BTC_REQUEST_URI = "https://api.coindesk.com/v1/bpi/currentprice.json";
    public static final String EXCHANGE_REQUEST_URI = "https://api.exchangeratesapi.io/latest";
    public static final String DISCLAIMER = "disclaimer";
    public static final String RATE = "rate"; //Used to parse bitcoin api response
    public static final String RATES = "rates"; //Used to parse currency exchange api response
    public static final String BTC_ENDPOINT = "/bitcoin";
    public static final String BTC_USD_ENDPOINT = "/bitcoin/USD";
    public static final String BTC_EUR_ENDPOINT = "/bitcoin/EUR";
    public static final String BTC_GBP_ENDPOINT = "/bitcoin/GBP";
    public static final String BTC_CAD_ENDPOINT = "/bitcoin/CAD";
}
