package com.example.shop.service.impl;

import com.example.shop.model.CategoryType;
import com.example.shop.repository.CategoryTypeRepository;
import com.example.shop.service.CategoryTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CategoryTypeServiceImpl implements CategoryTypeService {

    private CategoryTypeRepository categoryTypeRepository;

    @Override
    public CategoryType createCategoryType(CategoryType categoryType) {
        return categoryTypeRepository.save(categoryType);
    }

    @Override
    public CategoryType getCategoryTypeById(Long id) {
        return null;
    }

    @Override
    public void deleteCategoryTypeById(Long id) {
        categoryTypeRepository.deleteById(id);
    }

    @Override
    public List<CategoryType> getCategoryTypes() {
        return null;
    }
}
