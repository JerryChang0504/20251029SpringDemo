package om.gjun.jds.service;

import java.util.List;

import om.gjun.jds.dto.request.ProductReq;
import om.gjun.jds.dto.request.updateProductReq;
import om.gjun.jds.entity.Product;

public interface ProductService {

	public List<Product> queryAllProducts();

	public Product addProduct(ProductReq req);

	public Product updateProduct(updateProductReq req);
}