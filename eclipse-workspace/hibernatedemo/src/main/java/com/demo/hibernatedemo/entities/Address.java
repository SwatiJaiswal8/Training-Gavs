package com.demo.hibernatedemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String city;
	private String country;
	@OneToOne(mappedBy = "empAddress")
	private Employee empData;
	public Address() {
		super();
	}
	public Address(int addressId, String city, String country) {
		this.addressId = addressId;
		this.city = city;
		this.country = country;
	}
	public Address( String city, String country) {
		this.city = city;
		this.country = country;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getEmpData() {
		return empData;
	}
	public void setEmpData(Employee empData) {
		this.empData = empData;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", country=" + country +  "]";
	}
	
}
