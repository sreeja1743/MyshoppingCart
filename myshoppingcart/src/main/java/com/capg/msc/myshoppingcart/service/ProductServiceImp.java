package com.capg.msc.myshoppingcart.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.msc.myshoppingcart.beans.Product;
import com.capg.msc.myshoppingcart.dao.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {
	
	
	@Autowired
	private ProductRepository repo;
	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public Product SaveProduct(Product p) {
		
		repo.save(p);
		return p;
	}

	@Override
	public void deleteProductById(int id) {
		repo.deleteById(id);
		
		
	}

	@Override
	public void updateProductById(Product p, int id) {
		
		repo.save(p);
	}

	@Override
	public Product getProductById(int id) {
		return repo.findById(id).get();
	} 
	

	
	
	
	
}