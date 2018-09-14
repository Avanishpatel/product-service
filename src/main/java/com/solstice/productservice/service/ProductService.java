package com.solstice.productservice.service;

import com.solstice.productservice.domain.Product;
import com.solstice.productservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getProducts() {

        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {

        return productRepository.findById(id);
    }

    public Product addProduct(Product product) {

        return productRepository.save(product);
    }

    public void removeProduct(long id) {

        productRepository.deleteById(id);
    }

    public Product updateProduct(Product product) {

        return productRepository.save(product);
    }
}
