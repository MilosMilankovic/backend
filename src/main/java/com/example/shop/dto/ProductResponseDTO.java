package com.example.shop.dto;

import com.example.shop.model.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class ProductResponseDTO {

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Category category;

}
