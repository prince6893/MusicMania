package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "index";
		
	}
	@RequestMapping("/AboutUs")
	public String aboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/AllProducts")
	public String allProducts()
	{
		return "AllProducts";
	}
	@RequestMapping("/ContactUs")
	public String contactUs()
	{
		return "ContactUs";
	}
	
	@RequestMapping("/index")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/Register")
	public String register() 
	{
	return "Register";
	}

	@RequestMapping("/Login")
	public String login()
	
	{
	return "Login";
	}

}





