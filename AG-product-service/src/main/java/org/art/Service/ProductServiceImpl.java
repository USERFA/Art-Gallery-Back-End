package org.art.Service;

import java.util.List;
import java.util.Optional;

import org.art.Model.Product;
import org.art.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo pr;

	@Override
	public List<Product> getProducts() {
		return pr.findAll();
	}

	@Override
	public Product addProduct(Product p) {
		Product s =	pr.save(p);
		return s;
		
	}

	@Override
	public Product getProductbyId(long id) {
		Optional<Product> p=pr.findById(id);
		Product s1=null;
		if(p.isPresent()) {
			s1=p.get();
		}else {
			throw new RuntimeException("Product not found");
		}
		return s1;
		}


	@Override
	public void deleteProduct(long id) {
		pr.deleteById(id);
		
	}

	@Override
	public Product findProductByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
