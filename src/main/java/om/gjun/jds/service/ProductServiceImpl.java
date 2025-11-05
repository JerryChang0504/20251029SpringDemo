package om.gjun.jds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.gjun.jds.entity.Product;
import om.gjun.jds.repository.ProductRepository;
import om.gjun.jds.request.ProductReq;
import om.gjun.jds.request.UpdateReq;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	// methods
	@Override
	public List<Product> findAllProducts() {
		List<Product> products = productRepository.findAll();

		return products;
	}

	@Override
	public Product saveProduct(ProductReq req) {
		Product product = Product.builder().name(req.getName()).description(req.getDescription()).price(req.getPrice())
				.image(req.getImage()).build();

		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(UpdateReq req) {

		Integer id = req.getId();

		Product product = productRepository.findById(id).orElse(null);
		product.setName(product.getName());
		product.setDescription(product.getDescription());
		product.setPrice(product.getPrice());
		product.setImage(product.getImage());

		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

}
