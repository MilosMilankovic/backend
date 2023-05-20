package com.example.shop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
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

    @CreatedDate
    private Instant createDate;

    @LastModifiedDate
    private Instant modifiedDate;

}
