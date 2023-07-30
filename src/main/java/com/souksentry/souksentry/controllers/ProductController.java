package com.souksentry.souksentry.controllers;

import com.souksentry.souksentry.dao.MarketRepo;
import com.souksentry.souksentry.models.Product;
import com.souksentry.souksentry.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private  ProductService productService;


    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/api/products/{productId}")
    public ResponseEntity<Product> getProductByUuid(@PathVariable UUID productUuid) {
        Product product = productService.getProductById(productUuid);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/api/products")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product) {
        Product newProduct = productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @PutMapping("/api/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable UUID productUuid, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(productUuid, product);
        if (updatedProduct != null) {
            return ResponseEntity.ok(updatedProduct);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/api/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable UUID productUuid) {
        boolean deleted = productService.deleteProduct(productUuid);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/api/products/market/{marketId}")
    public ResponseEntity<List<Product>> getProductsForMarket(@PathVariable UUID marketUuid) {
        try {
            List<Product> productsInMarket = productService.getProductsForMarket(marketUuid);
            if (productsInMarket != null) {
                return ResponseEntity.ok(productsInMarket);
            }
        } catch (FileNotFoundException ex) {
            log.error("The market wasn't found.", ex);
        }
        return ResponseEntity.notFound().build();
    }

}
