package com.gjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjun.dto.request.ProductReq;
import com.gjun.entity.Product;
import com.gjun.service.ProductService;
@CrossOrigin(origins = "http://localhost:5175")
@RestController
@RequestMapping("api")
public class ProductController {
	
	@Autowired
	private ProductService  productService;
	
	@GetMapping("QueryAllProducts")
	public ResponseEntity<List<Product>> QueryProduct(){
		return ResponseEntity.ok(productService.QueryAllProduct());
	}
	
	@PostMapping("saveProducts")
	public void saveProduct(@RequestBody ProductReq req) {
		ResponseEntity.ok(productService.saveProduct(req));
	}
}
