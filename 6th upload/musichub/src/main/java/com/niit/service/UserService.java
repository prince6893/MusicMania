package com.niit.service;

import java.util.List;

import com.niit.model.Users;

public interface UserService {
	public void addUser(Users users);// copied dao lines

	public void deleteUser(Users users);// copy dao lines

	public Users getUserById(int userId);

	public void editUser(Users users);

	public List<Users> getAllUsers();

}
