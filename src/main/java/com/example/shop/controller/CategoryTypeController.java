package com.example.shop.controller;

import com.example.shop.model.CategoryType;
import com.example.shop.service.CategoryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/category-types")
public class CategoryTypeController {

    private final CategoryTypeService categoryTypeService;

    @Autowired
    public CategoryTypeController(CategoryTypeService categoryTypeService) {
        this.categoryTypeService = categoryTypeService;
    }

    @PostMapping
    public ResponseEntity<CategoryType> createCategoryType(@RequestBody CategoryType categoryType) {
        return new ResponseEntity<>(categoryTypeService.createCategoryType(categoryType), HttpStatus.CREATED);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<CategoryType> getCategoryType(@PathVariable Long id) {
        return new ResponseEntity<>(categoryTypeService.getCategoryTypeById(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<CategoryType>> getCategoryTypes() {
        return new ResponseEntity<>(categoryTypeService.getCategoryTypes(), HttpStatus.OK);
    }

}
