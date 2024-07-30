package com.Variables;

import ArraysConcepts.PayementPage;

public class OrderPage {
	OrderPage orderpage;	
	String OrderValue;
	public OrderPage() {
		
	}
	
	public OrderPage(String OrderValue) {
		this.OrderValue = OrderValue;
		System.out.println("Your are in OrderPage");
		new PayementPage(this);
	}
	
	
	public void Number() {
		System.out.println(OrderValue + "in Orderpage");
	}
	
}
