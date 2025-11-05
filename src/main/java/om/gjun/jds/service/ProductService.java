package om.gjun.jds.service;

import java.util.List;

import om.gjun.jds.entity.Product;
import om.gjun.jds.request.ProductReq;
import om.gjun.jds.request.UpdateReq;

public interface ProductService {

	// methods
	public List<Product> findAllProducts();

	public Product saveProduct(ProductReq req);

	public Product updateProduct(UpdateReq req);

	public void deleteProduct(Integer id);

}
