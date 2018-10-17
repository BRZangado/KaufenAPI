package com.example.kaufen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kaufen.models.Product;
import com.example.kaufen.models.Store;
import com.example.kaufen.repository.ProductRepository;
import com.example.kaufen.repository.StoreRepository;

@RestController
public class StoreController {
	
	@Autowired
	StoreRepository sr;
	@Autowired
	ProductRepository pr;
	
	@GetMapping("/stores")
	public List<Store> all(){
		return sr.findAll();
	}
	
	@PostMapping("/stores")
	public Store new_store(@RequestBody Store new_store){
		return sr.save(new_store);
	}
	
	@GetMapping("/stores/{store_id}/products")
	public List<Product> get_store_products(@PathVariable Long store_id){
		Store store = sr.getOne(store_id);
		return pr.findByStore(store);
	}

}
