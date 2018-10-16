package com.example.kaufen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kaufen.models.Client;
import com.example.kaufen.repository.ClientRepository;

@RestController
public class ClientController {
	
	@Autowired
	ClientRepository cr;
	
	@GetMapping("/client")
	public List<Client> all(){
		return cr.findAll();
	}
	
	@PostMapping("/client")
	public Client newClient(@RequestBody Client new_client){
		return cr.save(new_client);
	}

}
