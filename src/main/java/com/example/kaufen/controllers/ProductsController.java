package com.example.kaufen.controllers;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kaufen.models.Product;
import com.example.kaufen.repository.ProductRepository;

@RestController
public class ProductsController{
	
	@Autowired
	ProductRepository pr;
	
	@GetMapping("/products")
	public List<Product> all(){
		return pr.findAll();
	}
	
	@PostMapping("/products")
	public Product new_product(@RequestBody Product new_product){
		return pr.save(new_product);
	}
	
	@GetMapping("/products/{id}")
	public Optional<Product> get_by_id(@PathVariable Long id){
		return pr.findById(id);
	}
	
}
