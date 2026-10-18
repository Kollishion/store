package com.code.store.service;

import com.code.store.model.Product;
import com.code.store.repository.ProductRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;

	// List<Product> products = new ArrayList<>(Arrays.asList(
	// 		new Product(101, "Iphone", 50000)));
	//
	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(new Product());
	}
	
	public Product addProduct(Product prod) {
		return repo.save(prod);
	}
	

	public void updateProduct(Product prod) {
		repo.save(prod);
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}
}
