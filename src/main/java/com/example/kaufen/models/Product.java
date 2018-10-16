package com.example.kaufen.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product implements Serializable{

	private static final long serialVersionUID = -7148497842478267332L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private Float price_cents;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<OrderList> order_lists;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice_cents() {
		return price_cents;
	}
	public void setPrice_cents(Float price_cents) {
		this.price_cents = price_cents;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
