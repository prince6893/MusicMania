package com.niit.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userid;
	private String username;
	private String usernumber;
	private String useremail;
	private String userloginname;
	private String userloginpassword;
	private boolean enabled;
	


    public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@OneToOne
    @JoinColumn(name = "billsId")
    private BillingAddress billingAddress;

    @OneToOne
    @JoinColumn(name = "shipId")
    private ShippingAddress shippingAddress;
    
    @OneToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsernumber() {
		return usernumber;
	}

	public void setUsernumber(String usernumber) {
		this.usernumber = usernumber;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserloginname() {
		return userloginname;
	}

	public void setUserloginname(String userloginname) {
		this.userloginname = userloginname;
	}

	public String getUserloginpassword() {
		return userloginpassword;
	}

	public void setUserloginpassword(String userloginpassword) {
		this.userloginpassword = userloginpassword;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
