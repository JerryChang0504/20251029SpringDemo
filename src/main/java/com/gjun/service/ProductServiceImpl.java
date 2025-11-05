package com.gjun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.gjun.dto.request.ProductReq;
import com.gjun.dto.request.UpdateProductReq;
import com.gjun.entity.Product;
import com.gjun.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public List<Product> QueryAllProduct() {
    return productRepository.findAll();
  }

  @Override
  public void SaveProduct(List<Product> products) {
    Optional.ofNullable(products)
        .filter(list -> !CollectionUtils.isEmpty(list))
        .ifPresent(productRepository::saveAll);
  }

  @Override
  public Product saveProduct(ProductReq req) {
    Product product = Product.builder()
        .name(req.getName())
        .price(req.getPrice())
        .description(req.getDescription())
        .image(req.getImage())
        .build();

    return productRepository.save(product);
  }

  @Override
  public Product updateProduct(UpdateProductReq req) {
    return productRepository.findById(req.getId()).map(original -> {
      Product updated = Product.builder().id(original.getId()).name(req.getName()).price(req.getPrice())
          .description(req.getDescription()).image(req.getImage()).build();
      return productRepository.save(updated);
    }).orElse(null);

  }

  @Override
  public void deleteProduct(Integer id) {
    productRepository.deleteById(id);
  }

}
