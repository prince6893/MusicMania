package com.niit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
@Entity
public class Supplier implements Serializable{
	@Id

	private String sid;
	private String supname;
	private String supaddress;
	private String supnumber;
	private String supemail;
	private String brand;
	private String supproduct;
	
	@OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Product> product;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSupname() {
		return supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	public String getSupaddress() {
		return supaddress;
	}

	public void setSupaddress(String supaddress) {
		this.supaddress = supaddress;
	}

	public String getSupnumber() {
		return supnumber;
	}

	public void setSupnumber(String supnumber) {
		this.supnumber = supnumber;
	}

	public String getSupemail() {
		return supemail;
	}

	public void setSupemail(String supemail) {
		this.supemail = supemail;
	}

	public String getSupproduct() {
		return supproduct;
	}

	public void setSupproduct(String supproduct) {
		this.supproduct = supproduct;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
