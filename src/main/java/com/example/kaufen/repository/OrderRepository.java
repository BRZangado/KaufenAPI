package com.example.kaufen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.kaufen.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
