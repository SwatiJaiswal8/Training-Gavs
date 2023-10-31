package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Currency {
    @Id
    private String currencyCode;
    private String name;
    private double amount; 
    public Currency() {}

    public Currency(String code, String name, double amount) {
		super();
		this.currencyCode = code;
		this.name = name;
		this.amount = amount;
	}

	public String getCode() {
        return currencyCode;
    }

    public void setCode(String code) {
        this.currencyCode = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

	@Override
	public String toString() {
		return "Currency [code=" + currencyCode + ", name=" + name + ", amount=" + amount + "]";
	}
    
}
