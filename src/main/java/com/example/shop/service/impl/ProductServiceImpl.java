package com.example.shop.service.impl;

import com.example.shop.dto.ProductRequestDTO;
import com.example.shop.dto.ProductResponseDTO;
import com.example.shop.mapper.ProductMapper;
import com.example.shop.model.Category;
import com.example.shop.model.CategoryType;
import com.example.shop.model.Product;
import com.example.shop.repository.ProductRepository;
import com.example.shop.service.CategoryService;
import com.example.shop.service.CategoryTypeService;
import com.example.shop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private CategoryTypeService categoryTypeService;
    private ProductMapper productMapper;

    @Override
    public Product createProduct(ProductRequestDTO productRequestDTO) {
        CategoryType categoryType = categoryTypeService.getCategoryTypeById(productRequestDTO.getCategoryId());
        // TODO Fali provera da li postoji ? Ako ne postoji ovde se baca exception zato sto proizvod ne moze da se cuva u bazu bez category Type
        Product product = productMapper.productRequestDTOToProduct(productRequestDTO);
        product.setCategoryType(categoryType);
        return productRepository.save(product);
    }

    @Override
    public List<ProductResponseDTO> getProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::productToProductResponseDTO)
                //.map(product -> productMapper.productToProductResponseDTO(product))
                .collect(Collectors.toList());
    }

    @Override
    public ProductResponseDTO getProductById(Long id) {
        return productMapper.productToProductResponseDTO(productRepository.findById(id).get());
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }


}
