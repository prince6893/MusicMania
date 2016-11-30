package com.niit.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UsersOrderDAO;
import com.niit.model.UsersOrder;
import com.niit.service.UsersOrderService;

@Service
@Transactional
public class UsersOrderServiceImpl implements UsersOrderService {
@Autowired
private UsersOrderDAO usersOrderDAO;

public void addUsersOrder(UsersOrder usersOrder) {
	// TODO Auto-generated method stub
	usersOrderDAO.addUsersOrder(usersOrder);
}

public void deleteUsersOrder(UsersOrder usersOrder) {
	// TODO Auto-generated method stub
	usersOrderDAO.deleteUsersOrder(usersOrder);
	
}

public UsersOrder getUsersOrderById(int orderId) {
	// TODO Auto-generated method stub
	return usersOrderDAO.getUsersOrderById(orderId);
}

public void editUsersOrder(UsersOrder usersOrder) {
	// TODO Auto-generated method stub
	usersOrderDAO.editUsersOrder(usersOrder);
}

public List getAllUsersOrder() {
	// TODO Auto-generated method stub
	return usersOrderDAO.getAllUsersOrder();
}

}
