package com.example.shop.service;

import com.example.shop.dto.ProductRequestDTO;
import com.example.shop.dto.ProductResponseDTO;
import com.example.shop.model.Category;
import com.example.shop.model.Product;

import java.util.List;

public interface ProductService {

    public Product createProduct(ProductRequestDTO product);

    public List<Product> getProducts();

    ProductResponseDTO getProduct(Long id);
}
