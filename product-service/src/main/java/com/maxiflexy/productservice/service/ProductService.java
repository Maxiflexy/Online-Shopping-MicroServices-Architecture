package com.maxiflexy.productservice.service;

import com.maxiflexy.productservice.dto.ProductRequest;
import com.maxiflexy.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    public void createProduct(ProductRequest productRequest);

    public List<ProductResponse> getAllProducts();
}
