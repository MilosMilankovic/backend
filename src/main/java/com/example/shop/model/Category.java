package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    //@JsonManagedReference
    //@JsonBackReference
//    @JsonIgnore
//    @OneToMany(mappedBy = "category")
//    private List<Product> products;

}
