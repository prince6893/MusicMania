package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/index"})
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("/AboutUs")
	public String aboutUs()
	{
		return "AboutUs";
	}
@RequestMapping("/Privacy")
public String privacy()
{
	return "Privacy";
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

}


