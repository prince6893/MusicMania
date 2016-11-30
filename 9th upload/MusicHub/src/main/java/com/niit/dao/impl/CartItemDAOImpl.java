package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartItemDAO;
import com.niit.model.CartItem;

@Repository
@Transactional
public class CartItemDAOImpl implements CartItemDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addCartItem(CartItem cartItem) {
		sessionFactory.openSession().save(cartItem);
		
	}

	public void deleteCartItem(CartItem cartItem) {
		sessionFactory.openSession().delete(cartItem);
		
	}

	public CartItem getCartItemById(int cartItemId) {
		return (CartItem) sessionFactory.openSession().get(CartItem.class, cartItemId);
	}

	public void editCartItem(CartItem cartItem) {
		sessionFactory.openSession().update(cartItem);		
	}

	public List getAllCartItems() {
		return sessionFactory.openSession().createQuery("from CartItem").list();
	}

}
