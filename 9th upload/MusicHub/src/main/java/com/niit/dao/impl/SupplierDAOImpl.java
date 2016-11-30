package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;
@Repository
@Transactional
public class SupplierDAOImpl implements SupplierDAO{
@Autowired
private SessionFactory sessionFactory;

	public void addSupplier(Supplier supplier) {
		sessionFactory.openSession().save(supplier);		
	}

	public void deleteSupplier(Supplier supplier) {
		sessionFactory.openSession().delete(supplier);
		
	}

	public Supplier getSupplierById(int sid) {
	return	(Supplier) sessionFactory.openSession().get(Supplier.class, sid);
	}

	public void editSupplier(Supplier supplier) {
		sessionFactory.openSession().update(supplier);		
	}

	public List getAllSupplier() {
		return sessionFactory.openSession().createQuery("from supplier").list();
	}

}
