package com.gjun.service;

import java.util.List;

import com.gjun.dto.request.ProductReq;
import com.gjun.dto.request.UpdateProductReq;
import com.gjun.entity.Product;

public interface ProductService {

	List<Product> QueryAllProduct();

	void SaveProduct(List<Product> products);

	Product saveProduct(ProductReq req);
	
	public Product updateProduct(UpdateProductReq req);

}