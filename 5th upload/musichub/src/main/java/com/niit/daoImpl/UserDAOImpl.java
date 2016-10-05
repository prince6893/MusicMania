package com.niit.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.dao.UserDAO;
import com.niit.model.Users;

public class UserDAOImpl implements UserDAO {
@Autowired
private SessionFactory sessionFactory;
	

	public void addUser(Users users) {
		sessionFactory.getCurrentSession().save(users);
	
		
	}


	@Override
	public void deleteUser(Users users) {
		sessionFactory.getCurrentSession().delete(users);
		
	}


	@Override//Overriding the interfaces methods
	public Users getUserById(int userId) {
		return (Users) sessionFactory.getCurrentSession().get(Users.class,userId);
		
	}


	public void editUser(Users users) {
		sessionFactory.getCurrentSession().update(users);
	}


	@Override
	public List<Users> getAllUsers() {
		return sessionFactory.getCurrentSession().createQuery("from Users").list();
	}

}
