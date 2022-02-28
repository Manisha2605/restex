package com.lti.restex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dmart")
public class ProductController {

	ProductDAO dao= new ProductDAO();
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/allproducts")
	public Product[] findAll() {
		return dao.getAll();
	}
	
	@GetMapping("/product/{productId}")
	public Product findById(@PathVariable(value= "productId") int prdId) {
		return dao.findById(prdId);
	}
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Product p) {
		dao.consumeJSONRequest(p);
	}
	
	@PutMapping("/update/{prdId}")
	public Product updateProduct(@PathVariable(value="prdId") int prdId,@RequestBody Product p)
	{
		return dao.updateProduct(prdId, p);
	}
	
}
