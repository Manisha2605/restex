package com.lti.restex.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductDAO {
	
	private static Map<Integer,Product> products = new HashMap<Integer, Product>();
	
	public ProductDAO() 
	{
		products.put(101,new Product("Mobile", "Samsung",2300));
		products.put(102,new Product("Charger", "Nokia",200));
		products.put(103,new Product("Battery", "Dell",4000));			
	}
	
	public Product findById(int id) {
		return products.get(id);
	}
	
	public Product[] getAll(){
		Collection<Product> values = products.values();
		return values.toArray(new Product[values.size()]);
	}
	
	public void consumeJSONRequest(Product p)
    {
		products.put(104, p);
		System.out.println(products);       
    }	
	
	
	public Product updateProduct(int id ,Product p)
	{
		products.put(id, p);
		System.out.println(" new cost " +p.getPrice());
		return products.get(id);
		
	}
	
	public String deleteProduct(int id)
	{
		products.remove(id);
		return "Product removed";
	}
	
}


