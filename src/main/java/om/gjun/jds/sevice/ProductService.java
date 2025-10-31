package om.gjun.jds.sevice;

import java.util.List;

import om.gjun.jds.dto.request.ProductReq;
import om.gjun.jds.entity.Product;

public interface ProductService {

	public List<Product> queryAllProducts();

	public Product saveProduct(ProductReq req);
}