package com.example.shop.dto;

import com.example.shop.model.Category;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductRequestDTO {

    private Long id;

    private String name;

    private String description;

    private Long categoryId;

}
