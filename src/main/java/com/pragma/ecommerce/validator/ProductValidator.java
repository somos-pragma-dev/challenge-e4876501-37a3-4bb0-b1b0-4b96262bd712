package com.pragma.ecommerce.validator;

import com.pragma.ecommerce.dto.ProductDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ProductValidator implements ConstraintValidator<ValidProduct, ProductDTO> {
    @Override
    public boolean isValid(ProductDTO productDTO, ConstraintValidatorContext context) {
        // Validación lógica
        return true;
    }
}