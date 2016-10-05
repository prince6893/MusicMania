package com.niit.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDAO;
import com.niit.model.Users;
import com.niit.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired//automatic mapping
	private UserDAO userDAO;

	public void addUser(Users users) {
		userDAO.addUser(users);

	}
	
	public void deleteUser(Users users) {
		userDAO.deleteUser(users);
		
	}

	@Override
	public Users getUserById(int userId) {
		return userDAO.getUserById(userId);
	}

	@Override
	public void editUser(Users users) {
		// TODO Auto-generated method stub
		userDAO.editUser(users);
	}

	@Override
	public List<Users> getAllUsers() {
		return userDAO.getAllUsers();
	}

}
