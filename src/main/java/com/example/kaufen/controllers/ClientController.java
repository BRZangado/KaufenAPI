package com.example.kaufen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kaufen.models.Client;
import com.example.kaufen.models.OrderList;
import com.example.kaufen.repository.ClientRepository;
import com.example.kaufen.repository.OrderRepository;

@RestController
public class ClientController {
	
	@Autowired
	ClientRepository cr;
	@Autowired
	OrderRepository or;
	
	@GetMapping("/client")
	public List<Client> all(){
		return cr.findAll();
	}
	
	@PostMapping("/client")
	public Client newClient(@RequestBody Client new_client){
		return cr.save(new_client);
	}
	
	@GetMapping("/client/{client_id}/orders")
	public List<OrderList> all_client_orders(@PathVariable Long client_id){
		Client client = cr.getOne(client_id);
		return or.findByClient(client);
	}

}
