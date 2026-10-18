package com.code.store.repository;

import org.springframework.stereotype.Repository;

import com.code.store.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	
}
