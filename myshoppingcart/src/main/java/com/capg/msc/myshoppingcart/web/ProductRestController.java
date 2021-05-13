package com.capg.msc.myshoppingcart.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.msc.myshoppingcart.beans.Product;
import com.capg.msc.myshoppingcart.service.ProductServiceImp;


@RestController
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	 private ProductServiceImp service;
	
	
	@GetMapping("/home")
	public String homeRequest() {
		return "WELCOME : MY SHOPPING APP "+LocalDateTime.now();
	}
	
	
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product p) {
		service.SaveProduct(p);
		return p;
	}
	
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return service.getAllProducts();
		
	}
	
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		return service.getProductById(id);
		
	} 
	
	
	@DeleteMapping("/deleteproduct/{id}")
	public void deleteProductById(@PathVariable int id) {
		service.deleteProductById(id);
	}
	
	
	@PutMapping("/updateproduct")
	public Product updateProductById(@RequestBody Product p) {
		
		service.updateProductById(p, p.getProductId());
		
		return p;
	}
	
	
	
	
}