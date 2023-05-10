package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class CategoryType{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    //@JsonBackReference
    @JsonIgnore
    @OneToMany(mappedBy = "categoryType")
    private Set<Product> productList = new HashSet<>();
}
