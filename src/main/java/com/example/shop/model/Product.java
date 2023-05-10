package com.example.shop.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name="categoryType_id")
    private CategoryType categoryType;

}
