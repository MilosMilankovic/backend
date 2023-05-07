package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;


    private String name;

    private String description;

//    @JsonBackReference
    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

}
