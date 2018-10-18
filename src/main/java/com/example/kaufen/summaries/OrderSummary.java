package com.example.kaufen.summaries;

import java.util.ArrayList;
import java.util.List;

import com.example.kaufen.models.OrderList;
import com.example.kaufen.models.Product;

public class OrderSummary {
	
	private List<Long> products_id;
	
	public OrderSummary(OrderList order) {
		this.products_id = new ArrayList<>();
		for(Product product : order.getProducts()) {
			this.products_id.add(product.getId());
		}
	}

}
