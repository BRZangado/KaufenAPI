package com.example.kaufen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kaufen.models.OrderList;
import com.example.kaufen.repository.OrderRepository;

@RestController
public class OrderListController{
	
	@Autowired
	OrderRepository or;
	
	@GetMapping("/orders")
	public List<OrderList> all(){
		return or.findAll();
	}

}
