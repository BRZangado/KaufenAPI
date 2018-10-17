package com.example.kaufen.controllers;
import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
