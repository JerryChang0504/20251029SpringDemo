package om.gjun.jds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import om.gjun.jds.entity.Product;
import om.gjun.jds.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	// methods
	public ResponseEntity<List<Product>> findAllProducts() {
		return ResponseEntity.ok(productService.findAllProducts());
	}
}
