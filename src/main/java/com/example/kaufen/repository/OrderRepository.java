package com.example.kaufen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kaufen.models.Client;
import com.example.kaufen.models.OrderList;

public interface OrderRepository extends JpaRepository<OrderList, Long>{
	List<OrderList> findByClient(Client client); 
}
