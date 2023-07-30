package com.souksentry.souksentry.services.impl;

import com.souksentry.souksentry.dao.MarketRepo;
import com.souksentry.souksentry.models.Market;
import com.souksentry.souksentry.models.Product;
import com.souksentry.souksentry.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private MarketRepo marketRepo;

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

    @Override
    public List<Product> getProductsForMarket(UUID marketUuid) throws FileNotFoundException {
        Market queriedMarket = marketRepo.findMarketById(marketUuid);
        if (queriedMarket != null) {
            // query for all products in the said market.
        } else {
            throw new FileNotFoundException();
        }
        return null;
    }
}
