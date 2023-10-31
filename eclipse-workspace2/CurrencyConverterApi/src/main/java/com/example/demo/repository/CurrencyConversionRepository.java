package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.CurrencyConversion;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversion, Long> {
	CurrencyConversion findByFromCurrencyCodeAndToCurrencyCode(String fromCurrencyCode, String toCurrencyCode);

	

	CurrencyConversion findByCurrencyCode1(String currencyCode);
	
}

