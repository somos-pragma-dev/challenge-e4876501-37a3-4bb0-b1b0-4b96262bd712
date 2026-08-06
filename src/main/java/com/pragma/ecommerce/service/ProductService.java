package com.pragma.ecommerce.service;

import com.pragma.ecommerce.dto.ProductDTO;
import com.pragma.ecommerce.entity.Product;
import com.pragma.ecommerce.repository.ProductRepository;
import com.pragma.ecommerce.validator.ProductValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductValidator productValidator;

    @Transactional
    public ProductDTO createProduct(ProductDTO productDTO) {
        productValidator.validate(productDTO);
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct);
    }

    // Otros métodos CRUD
}