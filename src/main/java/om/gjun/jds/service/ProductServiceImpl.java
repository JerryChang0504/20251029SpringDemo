package om.gjun.jds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.gjun.jds.entity.Product;
import om.gjun.jds.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;

	// methods
	List<Product> findAllProducts() {
		List<Product> products = productRepository.findAll();

		return products;
	}
}
