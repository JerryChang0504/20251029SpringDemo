package om.gjun.jds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import om.gjun.jds.entity.Product;
import om.gjun.jds.request.ProductReq;
import om.gjun.jds.request.UpdateReq;
import om.gjun.jds.service.ProductService;

@RequestMapping("api")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	// methods
	@GetMapping("/find-all-product")
	public ResponseEntity<List<Product>> findAllProducts() {
		return ResponseEntity.ok(productService.findAllProducts());
	}

	@PostMapping("/save-product")
	public void saveProduct(@RequestBody ProductReq req) {
		productService.saveProduct(req);
	}

	@PatchMapping("/patch-product")
	public Product updateProduct(@RequestBody UpdateReq req) {
		return productService.updateProduct(req);
	}

	@DeleteMapping("/delete-product/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}

}
