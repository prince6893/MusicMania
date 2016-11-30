package com.niit.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersOrderDAO;
import com.niit.model.UsersOrder;

@Repository
@Transactional
public class UsersOrderDAOImpl implements UsersOrderDAO{
@Autowired
private SessionFactory sessionFactory;
	public void addUsersOrder(UsersOrder usersOrder) {
		sessionFactory.openSession().save(usersOrder);		
	}

	public void deleteUsersOrder(UsersOrder usersOrder) {
		sessionFactory.openSession().delete(usersOrder);		
	}

	public UsersOrder getUsersOrderById(int orderId) {
	return	(UsersOrder) sessionFactory.openSession().get(UsersOrder.class, orderId);
	}

	public void editUsersOrder(UsersOrder usersOrder) {
		sessionFactory.openSession().update(usersOrder);
		
	}

	public List getAllUsersOrder() {
	return	sessionFactory.openSession().createQuery("from UsersOrder").list();
	}
	

}
