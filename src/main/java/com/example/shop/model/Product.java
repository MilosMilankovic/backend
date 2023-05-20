package com.example.shop.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Product{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name="categoryType_id")
    private CategoryType categoryType;

    @CreatedDate
    private Instant createDate;

    @LastModifiedDate
    private Instant modifiedDate;

}
