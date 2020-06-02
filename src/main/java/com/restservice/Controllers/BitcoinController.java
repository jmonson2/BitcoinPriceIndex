package com.restservice.Controllers;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.restservice.POJO.BitcoinAllCurrencyPOJO;
import com.restservice.POJO.BitcoinPOJO;
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

    @PostMapping("/bitcoin")
    public BitcoinAllCurrencyPOJO bitcoin() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceUSD =  getPrice(USD, results);
        String priceEUR = getPrice(EUR, results);
        String priceGBP = getPrice(GBP, results);
        return new BitcoinAllCurrencyPOJO(disclaimer, priceUSD, priceEUR, priceGBP);
    }

    @PostMapping("/bitcoin/USD")
    public BitcoinPOJO bitcoinUSD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceUSD =  getPrice(USD, results);
        return new BitcoinPOJO(disclaimer, priceUSD);
    }

    @PostMapping("/bitcoin/EUR")
    public BitcoinPOJO bitcoinEUR() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceEUR =  getPrice(EUR, results);
        return new BitcoinPOJO(disclaimer, priceEUR);
    }

    @PostMapping("/bitcoin/GBP")
    public BitcoinPOJO bitcoinGBP() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceGBP =  getPrice(GBP, results);
        return new BitcoinPOJO(disclaimer, priceGBP);
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
        //Need to return 206 for unsupported currencies in future
        return UNSUPPORTED_CURRENCY;
    }
}