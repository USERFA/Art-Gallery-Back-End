package org.art.Service;

import java.util.List;

import org.art.Model.Product;
import org.springframework.stereotype.Service;

public interface ProductService {
	List<Product> getProducts();
	Product addProduct(Product p);
	Product getProductbyId(long id);
	void deleteProduct(long id);
	Product findProductByCode(String code);
}
