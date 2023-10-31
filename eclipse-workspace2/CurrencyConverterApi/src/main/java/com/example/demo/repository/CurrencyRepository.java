package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Currency;
import com.example.demo.entities.CurrencyConversion;

public interface CurrencyRepository extends JpaRepository<Currency, String> {

	Currency findByCurrencyCode(String currencyCode);
}

