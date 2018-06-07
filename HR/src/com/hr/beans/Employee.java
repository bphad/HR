package com.hr.beans;

import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

import com.hr.model.Account;

public class Employee {

	private int id;
	@Pattern(regexp="\\w+", message="Name Cannot b Blank")
	private String name;
	@Size(min=10,max=11,message="Cantact shd b 10 char")
	private String contact;
	@Pattern(regexp="\\w+",message="Name Cannot b Blank")
	private String city;
	@Pattern(regexp="\\w+",message="Name Cannot b Blank")
	private String street;

	private Address address;
	@Autowired
	private Account account;
	
	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

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
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", city=" + city + ", street="
				+ street + "]";
	}
	public List<Employee> getEmployee(){
		List<Employee> list = account.getEmployee();
		return list;
	}

	public Employee getSingleEmployee(int id) {
			Employee e = account.getSingleEmployee(id);
			return e;
		
	}

	public void createEmployee(Employee e) {
		account.createEmployee(e);
		
	}

}
