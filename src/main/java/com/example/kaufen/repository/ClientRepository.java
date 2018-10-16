package com.example.kaufen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.kaufen.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	
}
