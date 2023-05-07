package com.example.shop.dto;

import com.example.shop.model.Category;
import lombok.Data;

@Data
public class ProductResponseDTO {

    private Long id;

    private String name;

    private String description;

    private Category category;

}
