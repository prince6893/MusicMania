package com.niit.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartItemDAO;
import com.niit.model.CartItem;
import com.niit.service.CartItemService;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService{
@Autowired
private CartItemDAO cartItemDAO;
	public void addCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDAO.addCartItem(cartItem);
		
	}

	public void deleteCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDAO.deleteCartItem(cartItem);
		
	}

	public CartItem getCartItemById(int cartItemId) {
		// TODO Auto-generated method stub
		return cartItemDAO.getCartItemById(cartItemId);
	}

	public void editCartItem(CartItem cartItem) {
		// TODO Auto-generated method stub
		cartItemDAO.editCartItem(cartItem);
	}

	public List getAllCartItems() {
		// TODO Auto-generated method stub
		return cartItemDAO.getAllCartItems();
	}

}
