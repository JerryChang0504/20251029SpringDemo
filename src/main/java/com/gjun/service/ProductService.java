package com.gjun.service;

import java.util.List;

import com.gjun.entity.Product;

public interface ProductService {

	List<Product> QueryProduct();

	void SaveProduct(List<Product> products);

}