package com.pragim.springmvcwithjavaconfig.model;

public class Order {

	private int orderId;

	private int qty;
	
	private String foodItem;

	private String restnt;
	
	private double price;

	private int discount;
	
	

	public Order() {
		super();
	}

	

	public int getOrderId() {
		return orderId;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public String getRestnt() {
		return restnt;
	}

	public int getDiscount() {
		return discount;
	}

	

	public Order(int orderId, int qty, String foodItem, String restnt,
			double price, int discount) {
		super();
		this.orderId = orderId;
		this.qty = qty;
		this.foodItem = foodItem;
		this.restnt = restnt;
		this.price = price;
		this.discount = discount;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", foodItem=" + foodItem
				+ ", price=" + price + ", qty=" + qty + ", restnt=" + restnt
				+ ", discount=" + discount + "]";
	}

}
