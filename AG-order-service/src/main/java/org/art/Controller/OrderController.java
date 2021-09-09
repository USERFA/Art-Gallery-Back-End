package org.art.Controller;

import java.util.List;

import org.art.Model.Order;
import org.art.Model.Payment;
import org.art.Model.TransactionRequest;
import org.art.Model.TransactionResponse;
import org.art.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService os;
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(method=RequestMethod.POST, value="/makeorder")
	public Order purchaseorder(@RequestBody Order request) {
//	String responseFromMS2 = restTemplate.getForObject("http://localhost:8020/products/all",String.class);
	return os.saveOrder(request);	
}
	
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public List<Order> getAllO(){
		return os.getAll();
	}
}
