package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Repository

public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProduct(Product product) {
		sessionFactory.openSession().saveOrUpdate(product);	
	}

	public void deleteProduct(Product product) {
		
sessionFactory.getCurrentSession().delete(product);	
	}


	public Product getProductById(int pid) {
	return	(Product) sessionFactory.openSession().get(Product.class, pid);
	}


	public void editProduct(Product product) {
	sessionFactory.getCurrentSession().update(product);
	}

	@SuppressWarnings("unchecked")
	
	
	public List<Product> getAllProduct() {
		return sessionFactory.openSession().createQuery("from Product").list();
		}

}
