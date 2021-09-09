package org.art.Service;

import java.util.List;

import org.art.Model.Order;
import org.art.Model.Payment;
import org.art.Model.TransactionRequest;
import org.art.Model.TransactionResponse;
import org.art.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
	@Autowired
	private OrderRepo or;
	
	@Autowired
	private RestTemplate template;
	
	public Order saveOrder(Order o) {//(TransactionRequest request) {
//		String message="";
//		Order o = request.getOrder(); 
//		Payment p = request.getPayment();
//		p.setOrderId((int) o.getId());
//		p.setAmount(o.getTotalprice());
		//rest call later remove the url
//		Payment paymentresponse=template.postForObject("http://ag-payment-service/payment/doPayment",p, Payment.class);
//		message=paymentresponse.getPaymentStatus().equals("success")?"payment processing successful and order placed":"there is a failure in payment api, order added to cart";			
		return or.save(o);
//		 return new TransactionResponse(o,paymentresponse.getAmount(),paymentresponse.getTransactionId(),message);
	}
	
	public List<Order> getAll(){
		return or.findAll();	
		}
	
	
}
