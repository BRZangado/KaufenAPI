package com.example.kaufen;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.kaufen.models.Client;
import com.example.kaufen.models.Product;
import com.example.kaufen.models.Store;
import com.example.kaufen.repository.ClientRepository;
import com.example.kaufen.repository.OrderRepository;
import com.example.kaufen.repository.ProductRepository;
import com.example.kaufen.repository.StoreRepository;

@SpringBootApplication
public class KaufenApiApplication {
	
	@Autowired
	StoreRepository sr;
	@Autowired
	ClientRepository cr;
	@Autowired
	OrderRepository or;
	@Autowired
	ProductRepository pr;

	public static void main(String[] args) {
		SpringApplication.run(KaufenApiApplication.class, args);
	}
	
	@Bean
	InitializingBean sendDatabase() {
	    return () -> {
	    	
	    	Client client = new Client("Bruno", "Rodrigues Santos", "05912646173", "15/09/1996");
	    	cr.save(client);
	    	
	    	Store store = new Store("Carrefour", "Supermarket");
	    	sr.save(store);
	    	
	    	Product p1 = new Product("Item1", 199);
	    	p1.setStore(store);
	    	pr.save(p1);
	    	
	    	Product p2 = new Product("Item2", 199);
	    	p2.setStore(store);
	    	pr.save(p2);
	    	
	    	Product p3 = new Product("Item3", 199);
	    	p3.setStore(store);
	    	pr.save(p3);
	        
	      };
	}
}
