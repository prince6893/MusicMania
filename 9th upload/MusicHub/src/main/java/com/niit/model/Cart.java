package com.niit.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Cart implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartId;
	private double grandTotal;
	
	@OneToOne
	@JoinColumn(name="userid")
	@JsonIgnore
	private Users users;
	
	@OneToMany(mappedBy="cart", cascade= CascadeType.ALL, fetch=FetchType.EAGER)
	private List<CartItem> cartItems;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
}
