package org.art.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.art.Model.Payment;
import org.art.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepo pr;

	public Payment doPayment(Payment p) {
		p.setPaymentStatus(paymentProcessing());
		p.setTransactionId(UUID.randomUUID().toString());
		return pr.save(p);		
	}
	
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"false";
	}
	
	public Payment findPaymentHistoryByOrderId( int orderId){
		return pr.findByOrderId(orderId);
	}
	
	public List<Payment> getAll(){
		return pr.findAll();
	}
}
