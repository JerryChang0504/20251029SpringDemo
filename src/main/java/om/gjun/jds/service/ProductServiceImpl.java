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

		Product product = productRepository.findById(req.getId()).orElse(null);
		product.setName(req.getName());
		product.setDescription(req.getDescription());
		product.setPrice(req.getPrice());
		product.setImage(req.getImage());

		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

}
