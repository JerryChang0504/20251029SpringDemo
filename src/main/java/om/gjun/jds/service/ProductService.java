package om.gjun.jds.service;

import java.util.List;

import om.gjun.jds.dto.ProductDto;
import om.gjun.jds.entity.Product;

public interface ProductService {

	// methods
	public List<Product> findAllProducts();

	public Product saveProduct(ProductDto dto);

}
