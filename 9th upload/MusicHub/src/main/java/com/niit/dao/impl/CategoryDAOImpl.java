package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addCategory(Category category) {
		sessionFactory.openSession().save(category);		
	}

	public void deleteCategory(Category category) {
		
		sessionFactory.getCurrentSession().delete(category);
		
	}

	

	public void editCategory(Category category) {
		
		sessionFactory.getCurrentSession().update(category);
		
	}

	public List<Category> getAllCategories() {
	return	sessionFactory.openSession().createQuery("from Category").list();
		}

	public Category getCategoryById(int cid) {

		return	(Category) sessionFactory.openSession().get(Category.class, cid);
		
	}

}
