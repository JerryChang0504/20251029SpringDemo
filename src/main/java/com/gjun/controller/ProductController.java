package com.gjun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjun.dto.request.ProductReq;
import com.gjun.dto.request.UpdateProductReq;
import com.gjun.entity.Product;
import com.gjun.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Operation(summary = "取得所有產品清單")
	@ApiResponse(responseCode = "200", description = "查詢成功")
	@GetMapping("queryAllProducts")
	public ResponseEntity<List<Product>> QueryProduct() {
		return ResponseEntity.ok(productService.QueryAllProduct());
	}

	@PostMapping("saveProducts")
	public void saveProduct(@RequestBody ProductReq req) {
		ResponseEntity.ok(productService.saveProduct(req));
	}

	@PutMapping("updateProduct")
	public Product updateProduct(@RequestBody UpdateProductReq req) {
		return productService.updateProduct(req);
	}

	@Operation(summary = "刪除產品")
	@ApiResponse(responseCode = "200", description = "刪除成功")
	@DeleteMapping("deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		productService.deleteProduct(id);
	}
}
