package org.art.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.transform.ErrorListener;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue
	long id;
	@Column(name="clientemail")
	String clientemail;
	@Column(name="clientadress")
	String clientadress;
	@Column(name="totalprice")
	double totalprice;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getClientadress() {
		return clientadress;
	}public void setClientadress(String clientadress) {
		this.clientadress = clientadress;
	}
	public String getClientemail() {
		return clientemail;
	}
	public void setClientemail(String clientemail) {
		this.clientemail = clientemail;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	
	public Order(long id,String address,String email,double price) {
		this.id=id;
		this.clientadress=address;
		this.clientemail=email;
		this.totalprice=price;
	}
	public Order() {
		
	}

}
