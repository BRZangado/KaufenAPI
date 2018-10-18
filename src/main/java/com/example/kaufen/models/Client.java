package com.example.kaufen.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	
	private static final long serialVersionUID = 2792688092280820126L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String lastname;
	private String cpf;
	private String birthdate;
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<OrderList> orders_list;
	
	public Client(String name, String lastname, String cpf, String bithdate) {
		this.setName(name);
		this.setLastname(lastname);
		this.setBirthdate(bithdate);
		this.setCpf(cpf);
		this.orders_list = new ArrayList<OrderList>();
	}
	
	public Client(){}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<OrderList> getOrders_list() {
		return orders_list;
	}
	public void setOrders_list(List<OrderList> orders_list) {
		this.orders_list = orders_list;
	}
	public void add_OrderList(OrderList list) {
		this.orders_list.add(list);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
		
}
