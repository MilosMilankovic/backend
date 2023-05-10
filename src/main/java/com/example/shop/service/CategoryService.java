package com.example.shop.service;

import com.example.shop.model.Category;

import java.util.List;

public interface CategoryService {

    public Category createCategory(Category category);

    public List<Category> getCategories();

    public Category getCategoryById(Long id);

    public void deleteCategoryById(Long id);

}


