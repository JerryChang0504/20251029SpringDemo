package om.gjun.jds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import om.gjun.jds.entity.Product;
import om.gjun.jds.servie.ProductService;

@RestController
@RequestMapping("api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("queryAllProducts")
	public ResponseEntity<List<Product>> queryAllProducts() {
		return ResponseEntity.ok(productService.queryAllProducts());
	}

}
