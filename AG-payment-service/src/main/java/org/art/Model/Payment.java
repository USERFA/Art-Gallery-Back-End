package org.art.Model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payments")
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	@Column(name="paymentstatus")
	private String paymentStatus;
	@Column(name="transactionid")
	private String transactionId;
	@Column(name="orderid")
	private int orderId;
	@Column(name="amount")
	private double amount;
	
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
