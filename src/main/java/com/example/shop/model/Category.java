package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    //@JsonManagedReference
    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private Set<CategoryType> categoryTypeList = new HashSet<>();

}
