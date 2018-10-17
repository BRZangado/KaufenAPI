package com.example.kaufen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.kaufen.models.Product;
import com.example.kaufen.models.Store;

public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByStore(Store store);
}
