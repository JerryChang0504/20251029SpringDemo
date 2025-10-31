package om.gjun.jds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import om.gjun.jds.dto.request.ProductReq;
import om.gjun.jds.dto.request.UpdateProductReq;
import om.gjun.jds.entity.Product;
import om.gjun.jds.sevice.ProductService;

@Tag(name = "產品操作", description = "提供產品新增、查詢等操作")
@RestController
@RequestMapping("api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Operation(summary = "取得所有產品清單")
	@ApiResponse(responseCode = "200", description = "查詢成功")
	@GetMapping("queryAllProducts")
	public ResponseEntity<List<Product>> queryAllProducts() {
		return ResponseEntity.ok(productService.queryAllProducts());
	}

	@PostMapping("saveProduct")
	public void saveProducts(@RequestBody ProductReq req) {
		ResponseEntity.ok(productService.saveProduct(req));
	}

	@PutMapping("updateProduct")
	public Product postMethodName(@RequestBody UpdateProductReq req) {
		return productService.updatProduct(req);
	}

}
