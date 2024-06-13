package com.ass.product_api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product_info")
public class ProductEntity implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="alt_key")
	private long alt_key;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private double price;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="discription")
	private String discription;
	
	
	
	public long getAlt_key() {
		return alt_key;
	}
	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
	
	
	
	

}
