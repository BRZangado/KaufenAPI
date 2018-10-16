package com.example.kaufen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.kaufen.models.OrderList;

public interface OrderRepository extends JpaRepository<OrderList, Long>{

}
