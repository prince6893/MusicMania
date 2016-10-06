package com.niit.dao;

import java.util.List;

import com.niit.model.ShippingAddress;

public interface ShippingAddressDAO {
public void addShippingAddress(ShippingAddress shippingAddress);
public void deleteShippingAddress(ShippingAddress shippingAddress);
public ShippingAddress getShippingAddressById(int ShippingAddress);
public void editShippingAddress(ShippingAddress shippingAddress);
public List<ShippingAddress> getAllShippingAddresses();
}
