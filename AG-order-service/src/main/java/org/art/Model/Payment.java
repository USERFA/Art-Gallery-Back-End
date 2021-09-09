package org.art.Model;

import lombok.Data;

@Data
public class Payment {
	private int paymentId;
	private String paymentStatus;
	private String transactionId;
	private int orderId;
	private double amount;
	public String getTransactionId() {
		return transactionId;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public void setOrderId(int l) {
		this.orderId = l;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
}
