package com.pragma.ecommerce.service;

import com.pragma.ecommerce.dto.ProductDTO;
import com.pragma.ecommerce.entity.Product;
import com.pragma.ecommerce.repository.ProductRepository;
import com.pragma.ecommerce.validator.ProductValidator;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Mock
    private ProductValidator productValidator;

    @InjectMocks
    private ProductService productService;

    @Test
    void createProductTest() {
        MockitoAnnotations.openMocks(this);
        ProductDTO productDTO = new ProductDTO("Test Product", 100.0);
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        when(productRepository.save(any(Product.class))).thenReturn(product);
        ProductDTO result = productService.createProduct(productDTO);
        assertNotNull(result);
        assertEquals(productDTO.getName(), result.getName());
        assertEquals(productDTO.getPrice(), result.getPrice());
    }
}