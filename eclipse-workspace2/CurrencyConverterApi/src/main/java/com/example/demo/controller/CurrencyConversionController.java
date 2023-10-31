package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CurrencyConversion;
import com.example.demo.service.CurrencyConversionService;
import com.example.demo.service.CurrencyNotFoundException;

@RestController
@RequestMapping("/api/currency")  
public class CurrencyConversionController {
	  @Autowired
    private CurrencyConversionService conversionService;

	  @GetMapping("/exchangeRate")
	    public double getExchangeRate(@RequestParam String currencyCode) throws CurrencyNotFoundException {
	        return conversionService.getExchangeRate(currencyCode);
	    }

	  @PostMapping("/addProduct")
		public String addProduct(@RequestBody CurrencyConversion prd) {
			System.out.println(prd);
			conversionService.addCurrency(prd);
			return "Added successfully";
		}

    @PutMapping("/update")
    public String updateConversionRate(@RequestParam String fromCurrency,@RequestParam String toCurrency,
            @RequestParam double rate) {
        conversionService.updateConversionRate(fromCurrency, toCurrency, rate);
        return "Conversion rate updated successfully.";
    }
    @GetMapping("/allcurrency")
    public List<CurrencyConversion> getAllDetails(){
    	return conversionService.getAllCurrecyConversion();
    }
    
}
