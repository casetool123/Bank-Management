package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_master")
public class Customer{
	
	@Id
	String customer_number;
	String firstname;
	String middlename ;
	String lastname;
	String customerCity;
	String customerContact;
	String occupation;
	Date customerDob;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}		
		
	
	public Customer(String customer_number, String firstname, String middlename, String lastname, String customerCity,
			String customerContact, String occupation, Date customerDob) {
		super();
		this.customer_number = customer_number;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.customerCity = customerCity;
		this.customerContact = customerContact;
		this.occupation = occupation;
		this.customerDob = customerDob;
	}
	public String getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getCustomerDob() {
		return customerDob;
	}
	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}
	
	
	
	}
	
	