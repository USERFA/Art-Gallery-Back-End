package org.art.Controller;

import java.util.Arrays;
import java.util.List;

import org.art.Model.Product;
import org.art.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService ps;
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Product> getProducts(){
		return ps.getProducts();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/saveProduct")
	public Product addProduct(@RequestBody Product s) {
		return ps.addProduct(s);
	}
	
	@RequestMapping("/{id}")
	public Product getProduct(@PathVariable long id) {
		return ps.getProductbyId(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteProduct/{id}")
	public String deleteStudent(@PathVariable long id) {
		ps.deleteProduct(id);
		return "Product"+id+"deleted";
	}
	@RequestMapping("/orders") 
	public List<Object> getStudents() {
		String objects = restTemplate.getForObject("http://localhost:8022/order/all", String.class);
		return Arrays.asList(objects);
	}
}

