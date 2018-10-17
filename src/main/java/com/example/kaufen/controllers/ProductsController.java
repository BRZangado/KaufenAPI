package com.example.kaufen.controllers;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.kaufen.repository.ProductRepository;

@RestController
public class ProductsController{
	
	@Autowired
	ProductRepository pr;
	
}
