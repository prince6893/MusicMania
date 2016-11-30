package com.niit.service;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierService {
	public void addSupplier(Supplier supplier);
	public void deleteSupplier(Supplier supplier);
	public Supplier getSupplierById(int sid);
	public void editSupplier(Supplier supplier); 
	public List getAllSupplier();
}
