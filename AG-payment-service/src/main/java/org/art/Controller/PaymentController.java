package org.art.Controller;

import java.util.List;
import java.util.Random;

import org.art.Model.Payment;
import org.art.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService ps;
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(method=RequestMethod.POST,value="/dopayment")
	public Payment doPayment(@RequestBody Payment p) {
		return ps.doPayment(p);
	}
	
	@RequestMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
		return ps.findPaymentHistoryByOrderId(orderId);
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Payment> getallPayments(){
		return ps.getAll();
	}
	
	
}
