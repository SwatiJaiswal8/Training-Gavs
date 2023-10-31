package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CurrencyConversion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String currencyCode;
    @ManyToOne
    private Currency fromCurrency;

    @ManyToOne
    private Currency toCurrency;

    private double rate;
    public CurrencyConversion() {}
 

    public CurrencyConversion(Long id, Currency fromCurrency, Currency toCurrency, double rate,String currencyCode) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.rate = rate;
		this.currencyCode=currencyCode;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Currency getFromCurrency() {
		return fromCurrency;
	}



	public void setFromCurrency(Currency fromCurrency) {
		this.fromCurrency = fromCurrency;
	}



	public Currency getToCurrency() {
		return toCurrency;
	}



	public void setToCurrency(Currency toCurrency) {
		this.toCurrency = toCurrency;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}


	public String getCurrencyCode() {
		return currencyCode;
	}


	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}


	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
				+ ", rate=" + rate +"CurrencyCode"+ currencyCode+ "]";
	}



	
}