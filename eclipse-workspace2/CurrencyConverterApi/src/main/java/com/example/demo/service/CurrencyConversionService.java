package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CurrencyConversion;
import com.example.demo.repository.CurrencyConversionRepository;

@Service
public class CurrencyConversionService {
	@Autowired
    private  CurrencyConversionRepository repository;

   
	public double getExchangeRate(String currencyCode) throws CurrencyNotFoundException {
        CurrencyConversion currency = repository.findByCurrencyCode1(currencyCode);
        if (currency == null) {
            throw new CurrencyNotFoundException("Currency not found.");
        }
        return currency.getRate();
    }


    public void updateConversionRate(String fromCurrencyCode, String toCurrencyCode, double rate) {
    	CurrencyConversion conversionRate = repository.findByFromCurrencyCodeAndToCurrencyCode(fromCurrencyCode, toCurrencyCode);
        if (conversionRate != null) {
            conversionRate.setRate(rate);
            repository.save(conversionRate);
        }
    }
    public List<CurrencyConversion> getAllCurrecyConversion(){
    	List<CurrencyConversion> cur= new ArrayList<>();
    	 repository.findAll().forEach(cur::add);
    	 return cur;
    }
    public void addCurrency( CurrencyConversion cc) {
    	repository.save(cc);
    }
    

	
}

