package org.art.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	private long id;
	@Column(name="code")
	String code;
	@Column(name="name")
	String name;
	@Column(name="description")
	String description;
	@Column(name="price")
	Double price;
	@Column(name="instock")
	boolean inStock;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public boolean getInStock() {
		return inStock;
	}
	

}
