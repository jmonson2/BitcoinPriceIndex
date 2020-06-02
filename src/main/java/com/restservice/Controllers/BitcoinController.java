package com.restservice.Controllers;

import java.text.DecimalFormat;
import java.util.Map;

import com.restservice.POJO.BitcoinAllCurrency;
import com.restservice.POJO.Bitcoin;
import com.restservice.POJO.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.restservice.Constants.Constants.*;

@RestController
public class BitcoinController {

    private RestTemplate restTemplate = new RestTemplate();
    private JsonParser springParser = JsonParserFactory.getJsonParser();
    DecimalFormat priceFormat = new DecimalFormat("#.00");
    protected Logger logger = LoggerFactory.getLogger(BitcoinController.class);

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

    @PostMapping(BTC_HKD_ENDPOINT)
    public Bitcoin bitcoinHKD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceHKD =  getPrice(HKD, results);
        return new Bitcoin(disclaimer, priceHKD);
    }

    @PostMapping(BTC_ISK_ENDPOINT)
    public Bitcoin bitcoinISK() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceISK =  getPrice(ISK, results);
        return new Bitcoin(disclaimer, priceISK);
    }

    @PostMapping(BTC_PHP_ENDPOINT)
    public Bitcoin bitcoinPHP() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String pricePHP =  getPrice(PHP, results);
        return new Bitcoin(disclaimer, pricePHP);
    }

    @PostMapping(BTC_DKK_ENDPOINT)
    public Bitcoin bitcoinDKK() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceDKK =  getPrice(DKK, results);
        return new Bitcoin(disclaimer, priceDKK);
    }

    @PostMapping(BTC_HUF_ENDPOINT)
    public Bitcoin bitcoinHUF() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceHUF =  getPrice(HUF, results);
        return new Bitcoin(disclaimer, priceHUF);
    }

    @PostMapping(BTC_CZK_ENDPOINT)
    public Bitcoin bitcoinCZK() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceCZK =  getPrice(CZK, results);
        return new Bitcoin(disclaimer, priceCZK);
    }

    @PostMapping(BTC_AUD_ENDPOINT)
    public Bitcoin bitcoinAUD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceAUD =  getPrice(AUD, results);
        return new Bitcoin(disclaimer, priceAUD);
    }

    @PostMapping(BTC_RON_ENDPOINT)
    public Bitcoin bitcoinRON() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceRON =  getPrice(RON, results);
        return new Bitcoin(disclaimer, priceRON);
    }

    @PostMapping(BTC_SEK_ENDPOINT)
    public Bitcoin bitcoinSEK() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceSEK =  getPrice(SEK, results);
        return new Bitcoin(disclaimer, priceSEK);
    }

    @PostMapping(BTC_IDR_ENDPOINT)
    public Bitcoin bitcoinIDR() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceIDR =  getPrice(IDR, results);
        return new Bitcoin(disclaimer, priceIDR);
    }

    @PostMapping(BTC_INR_ENDPOINT)
    public Bitcoin bitcoinINR() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceINR =  getPrice(INR, results);
        return new Bitcoin(disclaimer, priceINR);
    }

    @PostMapping(BTC_BRL_ENDPOINT)
    public Bitcoin bitcoinBRL() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceBRL =  getPrice(BRL, results);
        return new Bitcoin(disclaimer, priceBRL);
    }

    @PostMapping(BTC_RUB_ENDPOINT)
    public Bitcoin bitcoinRUB() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceRUB =  getPrice(RUB, results);
        return new Bitcoin(disclaimer, priceRUB);
    }

    @PostMapping(BTC_HRK_ENDPOINT)
    public Bitcoin bitcoinHRK() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceHRK =  getPrice(HRK, results);
        return new Bitcoin(disclaimer, priceHRK);
    }

    @PostMapping(BTC_JPY_ENDPOINT)
    public Bitcoin bitcoinJPY() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceJPY =  getPrice(JPY, results);
        return new Bitcoin(disclaimer, priceJPY);
    }

    @PostMapping(BTC_THB_ENDPOINT)
    public Bitcoin bitcoinTHB() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceTHB =  getPrice(THB, results);
        return new Bitcoin(disclaimer, priceTHB);
    }

    @PostMapping(BTC_CHF_ENDPOINT)
    public Bitcoin bitcoinCHF() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceCHF =  getPrice(CHF, results);
        return new Bitcoin(disclaimer, priceCHF);
    }

    @PostMapping(BTC_SGD_ENDPOINT)
    public Bitcoin bitcoinSGD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceSGD =  getPrice(SGD, results);
        return new Bitcoin(disclaimer, priceSGD);
    }

    @PostMapping(BTC_PLN_ENDPOINT)
    public Bitcoin bitcoinPLN() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String pricePLN =  getPrice(PLN, results);
        return new Bitcoin(disclaimer, pricePLN);
    }

    @PostMapping(BTC_BGN_ENDPOINT)
    public Bitcoin bitcoinBGN() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceBGN =  getPrice(BGN, results);
        return new Bitcoin(disclaimer, priceBGN);
    }

    @PostMapping(BTC_TRY_ENDPOINT)
    public Bitcoin bitcoinTRY() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceTRY =  getPrice(TRY, results);
        return new Bitcoin(disclaimer, priceTRY);
    }

    @PostMapping(BTC_CNY_ENDPOINT)
    public Bitcoin bitcoinCNY() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceCNY =  getPrice(CNY, results);
        return new Bitcoin(disclaimer, priceCNY);
    }

    @PostMapping(BTC_NOK_ENDPOINT)
    public Bitcoin bitcoinNOK() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceNOK =  getPrice(NOK, results);
        return new Bitcoin(disclaimer, priceNOK);
    }

    @PostMapping(BTC_NZD_ENDPOINT)
    public Bitcoin bitcoinNZD() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceNZD =  getPrice(NZD, results);
        return new Bitcoin(disclaimer, priceNZD);
    }

    @PostMapping(BTC_ZAR_ENDPOINT)
    public Bitcoin bitcoinZAR() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceZAR =  getPrice(ZAR, results);
        return new Bitcoin(disclaimer, priceZAR);
    }

    @PostMapping(BTC_MXN_ENDPOINT)
    public Bitcoin bitcoinMXN() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceMXN =  getPrice(MXN, results);
        return new Bitcoin(disclaimer, priceMXN);
    }

    @PostMapping(BTC_ILS_ENDPOINT)
    public Bitcoin bitcoinILS() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceILS =  getPrice(ILS, results);
        return new Bitcoin(disclaimer, priceILS);
    }

    @PostMapping(BTC_KRW_ENDPOINT)
    public Bitcoin bitcoinKRW() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceKRW =  getPrice(KRW, results);
        return new Bitcoin(disclaimer, priceKRW);
    }

    @PostMapping(BTC_MYR_ENDPOINT)
    public Bitcoin bitcoinMYR() {
        String disclaimer;
        Map<String, Object> results;
        String response = restTemplate.getForObject(BTC_REQUEST_URI, String.class);
        results = springParser.parseMap(response);
        disclaimer = results.get(DISCLAIMER).toString();
        String priceMYR =  getPrice(MYR, results);
        return new Bitcoin(disclaimer, priceMYR);
    }

    protected String getPrice(String type, Map<
            String, Object> bpi) {
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
            CurrencyExchange currencyExchange = createCurrencyExchange(rates);
            Map priceEUR = (Map)prices.get(EUR);
            //Remove , in order to be able to parse as double
            double basePrice = Double.parseDouble(priceEUR.get(RATE).toString().replaceAll(",",""));
            if (CAD.equalsIgnoreCase(type)) {
                double result = currencyExchange.getCAD() * basePrice;
                return (priceFormat.format(result));
            }
            else if (HKD.equalsIgnoreCase(type)) {
                double result = currencyExchange.getHKD() * basePrice;
                return(priceFormat.format(result));
            }
            else if (ISK.equalsIgnoreCase(type)) {
                double result = currencyExchange.getISK() * basePrice;
                return(priceFormat.format(result));
            }
            else if (PHP.equalsIgnoreCase(type)) {
                double result = currencyExchange.getPHP() * basePrice;
                return(priceFormat.format(result));
            }
            else if (DKK.equalsIgnoreCase(type)) {
                double result = currencyExchange.getDKK() * basePrice;
                return(priceFormat.format(result));
            }
            else if (HUF.equalsIgnoreCase(type)) {
                double result = currencyExchange.getHUF() * basePrice;
                return(priceFormat.format(result));
            }
            else if (CZK.equalsIgnoreCase(type)) {
                double result = currencyExchange.getCZK() * basePrice;
                return(priceFormat.format(result));
            }
            else if (AUD.equalsIgnoreCase(type)) {
                double result = currencyExchange.getAUD() * basePrice;
                return(priceFormat.format(result));
            }
            else if (RON.equalsIgnoreCase(type)) {
                double result = currencyExchange.getRON() * basePrice;
                return(priceFormat.format(result));
            }
            else if (SEK.equalsIgnoreCase(type)) {
                double result = currencyExchange.getSEK() * basePrice;
                return(priceFormat.format(result));
            }
            else if (IDR.equalsIgnoreCase(type)) {
                double result = currencyExchange.getIDR() * basePrice;
                return(priceFormat.format(result));
            }
            else if (INR.equalsIgnoreCase(type)) {
                double result = currencyExchange.getINR() * basePrice;
                return(priceFormat.format(result));
            }
            else if (BRL.equalsIgnoreCase(type)) {
                double result = currencyExchange.getBRL() * basePrice;
                return(priceFormat.format(result));
            }
            else if (RUB.equalsIgnoreCase(type)) {
                double result = currencyExchange.getRUB() * basePrice;
                return(priceFormat.format(result));
            }
            else if (HRK.equalsIgnoreCase(type)) {
                double result = currencyExchange.getHRK() * basePrice;
                return(priceFormat.format(result));
            }
            else if (JPY.equalsIgnoreCase(type)) {
                double result = currencyExchange.getJPY() * basePrice;
                return(priceFormat.format(result));
            }
            else if (THB.equalsIgnoreCase(type)) {
                double result = currencyExchange.getTHB() * basePrice;
                return(priceFormat.format(result));
            }
            else if (CHF.equalsIgnoreCase(type)) {
                double result = currencyExchange.getCHF() * basePrice;
                return(priceFormat.format(result));
            }
            else if (SGD.equalsIgnoreCase(type)) {
                double result = currencyExchange.getSGD() * basePrice;
                return(priceFormat.format(result));
            }
            else if (PLN.equalsIgnoreCase(type)) {
                double result = currencyExchange.getPLN() * basePrice;
                return(priceFormat.format(result));
            }
            else if (BGN.equalsIgnoreCase(type)) {
                double result = currencyExchange.getBGN() * basePrice;
                return(priceFormat.format(result));
            }
            else if (TRY.equalsIgnoreCase(type)) {
                double result = currencyExchange.getTRY() * basePrice;
                return(priceFormat.format(result));
            }
            else if (CNY.equalsIgnoreCase(type)) {
                double result = currencyExchange.getCNY() * basePrice;
                return(priceFormat.format(result));
            }
            else if (NOK.equalsIgnoreCase(type)) {
                double result = currencyExchange.getNOK() * basePrice;
                return(priceFormat.format(result));
            }
            else if (NZD.equalsIgnoreCase(type)) {
                double result = currencyExchange.getNZD() * basePrice;
                return(priceFormat.format(result));
            }
            else if (ZAR.equalsIgnoreCase(type)) {
                double result = currencyExchange.getZAR() * basePrice;
                return(priceFormat.format(result));
            }
            else if (MXN.equalsIgnoreCase(type)) {
                double result = currencyExchange.getMXN() * basePrice;
                return(priceFormat.format(result));
            }
            else if (ILS.equalsIgnoreCase(type)) {
                double result = currencyExchange.getILS() * basePrice;
                return(priceFormat.format(result));
            }
            else if (KRW.equalsIgnoreCase(type)) {
                double result = currencyExchange.getKRW() * basePrice;
                return(priceFormat.format(result));
            }
            else if (MYR.equalsIgnoreCase(type)) {
                double result = currencyExchange.getMYR() * basePrice;
                return(priceFormat.format(result));
            }
            //Need to return 206 for unsupported currencies in future
            return UNSUPPORTED_CURRENCY;
        }
    }

    protected CurrencyExchange createCurrencyExchange(Map rates){
        try {
            CurrencyExchange currencyExchange = new CurrencyExchange(
                    Double.parseDouble(rates.get(CAD).toString()),
                    Double.parseDouble(rates.get(HKD).toString()),
                    Double.parseDouble(rates.get(ISK).toString()),
                    Double.parseDouble(rates.get(PHP).toString()),
                    Double.parseDouble(rates.get(DKK).toString()),
                    Double.parseDouble(rates.get(HUF).toString()),
                    Double.parseDouble(rates.get(CZK).toString()),
                    Double.parseDouble(rates.get(AUD).toString()),
                    Double.parseDouble(rates.get(RON).toString()),
                    Double.parseDouble(rates.get(SEK).toString()),
                    Double.parseDouble(rates.get(IDR).toString()),
                    Double.parseDouble(rates.get(INR).toString()),
                    Double.parseDouble(rates.get(BRL).toString()),
                    Double.parseDouble(rates.get(RUB).toString()),
                    Double.parseDouble(rates.get(HRK).toString()),
                    Double.parseDouble(rates.get(JPY).toString()),
                    Double.parseDouble(rates.get(THB).toString()),
                    Double.parseDouble(rates.get(CHF).toString()),
                    Double.parseDouble(rates.get(SGD).toString()),
                    Double.parseDouble(rates.get(PLN).toString()),
                    Double.parseDouble(rates.get(BGN).toString()),
                    Double.parseDouble(rates.get(TRY).toString()),
                    Double.parseDouble(rates.get(CNY).toString()),
                    Double.parseDouble(rates.get(NOK).toString()),
                    Double.parseDouble(rates.get(NZD).toString()),
                    Double.parseDouble(rates.get(ZAR).toString()),
                    Double.parseDouble(rates.get(MXN).toString()),
                    Double.parseDouble(rates.get(ILS).toString()),
                    Double.parseDouble(rates.get(KRW).toString()),
                    Double.parseDouble(rates.get(MYR).toString()));
            return currencyExchange;
        } catch(NullPointerException e) {
            logger.error("Found empty exchange results");
            CurrencyExchange currencyExchange = new CurrencyExchange();
            return currencyExchange;
        }
    }
}