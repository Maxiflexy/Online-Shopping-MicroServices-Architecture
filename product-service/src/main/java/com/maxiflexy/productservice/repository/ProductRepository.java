package com.maxiflexy.productservice.repository;

import com.maxiflexy.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
