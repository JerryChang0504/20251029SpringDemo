package om.gjun.jds.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.gjun.jds.dto.request.ProductReq;
import om.gjun.jds.dto.request.UpdateProductReq;
import om.gjun.jds.entity.Product;
import om.gjun.jds.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> queryAllProducts() {

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
	public Product updatProduct(UpdateProductReq req) {
		return productRepository.findById(req.getId()).map(original -> {
			Product updated = Product.builder().id(original.getId()).name(req.getName())
					.description(req.getDescription()).price(req.getPrice()).image(req.getImage()).build();
			return productRepository.save(updated);
		}).orElse(null);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

}
