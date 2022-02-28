package com.lti.restex.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private String name;
	private String description;
	private double price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String description, double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	
}
