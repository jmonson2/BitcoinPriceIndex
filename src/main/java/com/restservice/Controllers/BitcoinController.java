package com.restservice.Controllers;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.restservice.POJO.BitcoinAllCurrency;
import com.restservice.POJO.Bitcoin;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.restservice.Constants.Constants.*;

@RestController
public class BitcoinController {

    private final AtomicLong counter = new AtomicLong();
    private RestTemplate restTemplate = new RestTemplate();
    private JsonParser springParser = JsonParserFactory.getJsonParser();

    @PostMapping(BTC_ENDPOINT)
    public BitcoinAllCurrency bitcoin() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceUSD =  getPrice(USD, results);
        String priceEUR = getPrice(EUR, results);
        String priceGBP = getPrice(GBP, results);
        return new BitcoinAllCurrency(disclaimer, priceUSD, priceEUR, priceGBP);
    }

    @PostMapping(BTC_USD_ENDPOINT)
    public Bitcoin bitcoinUSD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceUSD =  getPrice(USD, results);
        return new Bitcoin(disclaimer, priceUSD);
    }

    @PostMapping(BTC_EUR_ENDPOINT)
    public Bitcoin bitcoinEUR() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceEUR =  getPrice(EUR, results);
        return new Bitcoin(disclaimer, priceEUR);
    }

    @PostMapping(BTC_GBP_ENDPOINT)
    public Bitcoin bitcoinGBP() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceGBP =  getPrice(GBP, results);
        return new Bitcoin(disclaimer, priceGBP);
    }

    @PostMapping(BTC_CAD_ENDPOINT)
    public Bitcoin bitcoinCAD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceCAD =  getPrice(CAD, results);
        return new Bitcoin(disclaimer, priceCAD);
    }

    private String getPrice(String type, Map<String, Object> bpi) {
        Map prices = (Map)bpi.get(BPI);
        if (USD.equalsIgnoreCase(type)) {
            Map priceUSD = (Map)prices.get(USD);
            return priceUSD.get(RATE).toString();
        }
        else if (EUR.equalsIgnoreCase(type)) {
            Map priceEUR = (Map)prices.get(EUR);
            return priceEUR.get(RATE).toString();
        }
        else if (GBP.equalsIgnoreCase(type)) {
            Map priceGBP = (Map)prices.get(GBP);
            return priceGBP.get(RATE).toString();
        }
        //Will need to do conversions for below Currencies
        else {
            String exchangeResponse = restTemplate.getForObject(EXCHANGE_REQUEST_URI, String.class);
            Map<String, Object> exchangeResults;
            exchangeResults = springParser.parseMap(exchangeResponse);
            Map rates = (Map)exchangeResults.get(RATES);
            Map priceEUR = (Map)prices.get(EUR);
            //Remove , in order to be able to parse as double
            double basePrice = Double.parseDouble(priceEUR.get(RATE).toString().replaceAll(",",""));
            if (CAD.equalsIgnoreCase(type)) {
                double rateCAD = Double.parseDouble(rates.get(CAD).toString());
                double result = rateCAD * basePrice;
                DecimalFormat priceFormat = new DecimalFormat("#.00");
                return (priceFormat.format(result));
            }
            //Need to return 206 for unsupported currencies in future
            return UNSUPPORTED_CURRENCY;
        }
    }
}