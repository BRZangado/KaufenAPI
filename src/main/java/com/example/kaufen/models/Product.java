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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable{

	private static final long serialVersionUID = -7148497842478267332L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private int price_cents;
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	@ManyToMany(mappedBy = "products")
	private Set<OrderList> order_lists = new HashSet<>();
	
	public Product(String name, int price_cents, Store store) {
		this.name = name;
		this.price_cents = price_cents;
		this.store = store;
	}
	
	public Product() {}
	
	public Long getStore() {
		return store.getId();
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public Set<OrderList> getOrder_lists() {
		return order_lists;
	}

	public void setOrder_lists(Set<OrderList> order_lists) {
		this.order_lists = order_lists;
	}

	public void addOrderList(OrderList order) {
		this.order_lists.add(order);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice_cents() {
		return price_cents;
	}
	public void setPrice_cents(int price_cents) {
		this.price_cents = price_cents;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
