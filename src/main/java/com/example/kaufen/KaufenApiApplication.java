package com.example.kaufen;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.kaufen.models.Client;
import com.example.kaufen.repository.ClientRepository;
import com.example.kaufen.repository.StoreRepository;

@SpringBootApplication
public class KaufenApiApplication {
	
	@Autowired
	StoreRepository sr;
	@Autowired
	ClientRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(KaufenApiApplication.class, args);
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	Client client = new Client("Bruno", "Rodrigues Santos", "05912646173", "15/09/1996");
	        cr.save(client);
	      };
	}
}
