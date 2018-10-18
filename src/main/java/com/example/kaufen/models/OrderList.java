package com.example.kaufen.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderList implements Serializable{
	
	private static final long serialVersionUID = 3088509324181490599L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "client_order_id")
	private Client client;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "order_products")
	private Set<Product> products = new HashSet<>();
	private String status;

	public OrderList(Client client, String status) {
		this.client = client;
		this.status = status;
	}
	
	public OrderList() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<Long> getProducts() {
		List<Long> products_ids = new ArrayList<>();
		for(Product product : this.products) {
			products_ids.add(product.getId());
		}
		return products_ids;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
