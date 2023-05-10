package com.example.shop.mapper;

import com.example.shop.dto.ProductRequestDTO;
import com.example.shop.dto.ProductResponseDTO;
import com.example.shop.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = CategoryTypeMapper.class)
public interface ProductMapper {


    @Mapping(target = "description", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "category", ignore = true)
    ProductResponseDTO productToProductResponseDTO(Product product);


    @Mapping(target = "categoryType", ignore = true)
    Product productRequestDTOToProduct(ProductRequestDTO productRequestDTO);

}
