package com.code.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.code.store.model.Product;
import com.code.store.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable("id") int prodId) {
		return service.getProductById(prodId);
	}

	@PostMapping("/products")
	public Product addProduct(@RequestBody Product prod) {
		return service.addProduct(prod);
	}

	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		service.updateProduct(prod);
	}

	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		service.deleteProduct(id);
	}
}
