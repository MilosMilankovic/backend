package com.example.shop.service;

import com.example.shop.dto.CategoryDTO;
import com.example.shop.model.Category;

import java.util.List;

public interface CategoryService {

    public CategoryDTO createCategory(CategoryDTO category);

    public List<CategoryDTO> getCategories();

    public CategoryDTO getCategoryById(Long id);

    public void deleteCategoryById(Long id);

}


