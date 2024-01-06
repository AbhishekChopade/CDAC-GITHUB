package com.app.pets;

public class Order {
	private int orderId;
	private int petId;
	private int quantity;
	private Status status;
	private static int idGenerator;
	static {
		idGenerator = 10;
	}
	public Order(int petId, int quantity) {
		super();
		this.orderId = ++idGenerator;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
	
	
}
