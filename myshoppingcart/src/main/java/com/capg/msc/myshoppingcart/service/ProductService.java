package com.capg.msc.myshoppingcart.service;

import java.util.List;

import com.capg.msc.myshoppingcart.beans.Product;

public interface ProductService {
	
	public List<Product>  getAllProducts();
	
	public Product SaveProduct(Product p);
	
	public void  deleteProductById(int id);
	
	public void  updateProductById(Product p,int id);
	
	public Product getProductById(int id);
	
	

}