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

    @CreatedDate
    private Instant createDate;

    @LastModifiedDate
    private Instant modifiedDate;

}
