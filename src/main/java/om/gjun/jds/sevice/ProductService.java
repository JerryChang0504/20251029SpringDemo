package om.gjun.jds.sevice;

import java.util.List;

import om.gjun.jds.entity.Product;

public interface ProductService {

	List<Product> queryAllProducts();
}