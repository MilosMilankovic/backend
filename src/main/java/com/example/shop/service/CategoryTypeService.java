package com.example.shop.service;

import com.example.shop.model.CategoryType;

import java.util.List;

public interface CategoryTypeService {

    public CategoryType createCategoryType(CategoryType categoryType);

    public CategoryType getCategoryTypeById(Long id);

    public void deleteCategoryTypeById(Long id);

    public List<CategoryType> getCategoryTypes();

}
