package com.souksentry.souksentry.services.impl;

import com.souksentry.souksentry.models.Product;
import com.souksentry.souksentry.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(UUID productUuid) {
        return null;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(UUID prodcutUuid, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(UUID productUuid) {
        return false;
    }
}
