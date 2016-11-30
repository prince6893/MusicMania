package com.niit.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.webflow.context.servlet.HttpServletContextMap;

import com.niit.model.Product;
import com.niit.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/product/add")
	public String addProductPage() {
		// ModelAndView modelAndView = new ModelAndView("add-product");
		// modelAndView.addObject("product", new Product());//to avoid NLP
		return "add-product";
	}

	@ModelAttribute("product")//command name
	public Product newProduct() {
		return new Product();
	}

	@RequestMapping(value = "/product/add/process", method = RequestMethod.POST)
	public String addProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result,
			HttpServletRequest request) {

		if (result.hasErrors()) {
			return "add-product";
		}

		

		MultipartFile productImage = product.getImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		Path path = Paths.get(rootDirectory + "/WEB-INF/resources/images/" + product.getPid() + ".png");

		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(path.toString()));
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException("Product image saving failed", ex);
			}
		}
		productService.addProduct(product);
		return "administrator";

	}

	@RequestMapping(value = "/product/list")
	public ModelAndView listOfProducts() {
		ModelAndView modelAndView = new ModelAndView("list-of-products");
		List<Product> product = productService.getAllProduct();
		modelAndView.addObject("Product", product);
		return modelAndView;
	}
	
	
	

	@RequestMapping("/product/editproduct/{pid}")
    public String editProduct(@PathVariable("pid") int pid,  Model model){
        Product product = productService.getProductById(pid);
 
        model.addAttribute("product", product);
 
        return "edit-product";
    }
 
 
    @RequestMapping(value="/product/editproduct", method = RequestMethod.POST)
    public String editProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result, HttpServletRequest request){
 
        if(result.hasErrors()){
            return "edit-product";
        }
 
 
        MultipartFile productImage = product.getImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        Path path = Paths.get(rootDirectory + "/WEB-INF/resources/images/" + product.getPid() + ".png");
 
        if(productImage != null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(path.toString()));
            } catch (Exception ex){
                ex.printStackTrace();
                throw new RuntimeException("Product image saving failed", ex);
            }
        }
 
        productService.editProduct(product);
 
        return "redirect:/administrator";
    }
 
 
    @RequestMapping("/product/delete/{pid}")
    public String deleteProduct(@PathVariable int pid, Model model, HttpServletRequest request){
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        Path path = Paths.get(rootDirectory + "/WEB-INF/resources/images/" + pid + ".png");
 
        if(Files.exists(path)){
            try {
                Files.delete(path);
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
 
        Product product = productService.getProductById(pid);
        productService.deleteProduct(product);
 
        return "redirect:/administrator";
    }

}
