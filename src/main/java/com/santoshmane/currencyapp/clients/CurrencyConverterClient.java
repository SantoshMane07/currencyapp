package com.santoshmane.currencyapp.clients;


public interface CurrencyConverterClient {
    public Double convertCurrency(String fromCurrency,String toCurrency, Double units);
}
