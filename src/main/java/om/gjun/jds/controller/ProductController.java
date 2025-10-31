package om.gjun.jds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import om.gjun.jds.dto.ProductDto;
import om.gjun.jds.entity.Product;
import om.gjun.jds.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	// methods
	@GetMapping("find-all-product")
	public ResponseEntity<List<Product>> findAllProducts() {
		return ResponseEntity.ok(productService.findAllProducts());
	}

	@PostMapping("save-product")
	public void saveProduct(@RequestBody ProductDto dto) {
		productService.saveProduct(dto);
	}

}
