package com.niit.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;
import com.niit.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
@Autowired
private CategoryDAO categoryDAo;

public void addCategory(Category category) {
	// TODO Auto-generated method stub
	categoryDAo.addCategory(category);
}

public void deleteCategory(Category category) {
	// TODO Auto-generated method stub
	categoryDAo.deleteCategory(category);
}

public Category getCategoryById(int cid) {
	// TODO Auto-generated method stub
	return categoryDAo.getCategoryById(cid);
}

public void editCategory(Category category) {
	// TODO Auto-generated method stub
	categoryDAo.editCategory(category);
}

public List<Category> getAllCategories() {
	// TODO Auto-generated method stub
	return categoryDAo.getAllCategories();
}
}
