package com.example.shop.service.impl;

import com.example.shop.dto.ProductRequestDTO;
import com.example.shop.dto.ProductResponseDTO;
import com.example.shop.model.Category;
import com.example.shop.model.Product;
import com.example.shop.repository.CategoryRepository;
import com.example.shop.repository.ProductRepository;
import com.example.shop.service.CategoryService;
import com.example.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private CategoryService categoryService;

    @Override
    public Product createProduct(ProductRequestDTO product) {
        Product product1 = new Product();
        product1.setName(product.getName());
        product1.setDescription(product.getDescription());
        Category category = categoryService.getCategory(product.getCategoryId());
        product1.setCategory(category);
        return productRepository.save(product1);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductResponseDTO getProduct(Long id) {
        Product product = productRepository.getById(id);
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setId(product.getId());
        productResponseDTO.setName(product.getName());
        productResponseDTO.setCategory(product.getCategory());
        return productResponseDTO;
    }


}
