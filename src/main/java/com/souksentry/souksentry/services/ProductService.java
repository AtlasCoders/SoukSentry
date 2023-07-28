package com.souksentry.souksentry.services;

import com.souksentry.souksentry.models.Product;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(UUID productUuid);
    Product addProduct(Product product);
    Product updateProduct(UUID prodcutUuid, Product product);
    boolean deleteProduct(UUID productUuid);
}
