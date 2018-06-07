package com.hr.beans;

import javax.validation.constraints.Pattern;

public class Address {
	
	@Pattern(regexp="\\w+",message="Name Cannot b Blank")
	private String city;
	
	@Pattern(regexp="\\w+",message="Name Cannot b Blank")
	private String street;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}

}
