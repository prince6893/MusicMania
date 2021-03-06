package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Users {
	@Id
	@GeneratedValue
	private int usersId;
	private String username;
	private String password;
	private Boolean enabled;
	private int customerId;
	@OneToOne
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getUsersId() {
	return usersId;
	}
	public void setUsersId(int usersId) {
	this.usersId = usersId;
	}
	public String getUsername() {
	return username;
	}
	public void setUsername(String username) {
	this.username = username;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	public Boolean getEnabled() {
	return enabled;
	}
	public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
	}
	public int getCustomerId() {
	return customerId;
	}
	public void setCustomerId(int customerId) {
	this.customerId = customerId;
	}
	
	@Override
	public String toString() {
	return "Users{" +
	"username='" + username + '\'' +
	", password='" + password + '\'' +
	
	'}';
	}
	}

