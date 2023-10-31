package com.example.demo.controller;

import com.example.demo.entities.Currency;
import com.example.demo.service.CurrencyNotFoundException;
import com.example.demo.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/convert")
    public String convertCurrency(@RequestParam String fromCurrency, @RequestParam String toCurrency, @RequestParam double amount, Model model) {
        double convertedAmount;
        try {
            convertedAmount = currencyService.convertCurrency(fromCurrency, toCurrency, amount);
            model.addAttribute("convertedAmount", convertedAmount);
        } catch (CurrencyNotFoundException e) {
            model.addAttribute("error", "Currency conversion failed: " + e.getMessage());
        }
        return "convertResult"; 
    }

    @GetMapping("/currencies")
    public String getAllCurrencies(Model model) {
        List<Currency> currencies = currencyService.getAllCurrencies();
        model.addAttribute("currencies", currencies);
        return "currencies"; 
    }
}
