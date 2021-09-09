package org.art.Model;

public class TransactionResponse {
	private Order order;
	private String transactionID;
	private double amount;
	String message;
	public TransactionResponse(Order o, double amount2, String transactionId2, String message2) {
		this.order=o;
		this.amount=amount2;
		this.transactionID=transactionId2;
		this.message=message2;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
}
