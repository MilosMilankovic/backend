package com.example.shop.service.impl;

import com.example.shop.dto.CategoryDTO;
import com.example.shop.mapper.CategoryMapper;
import com.example.shop.model.Category;
import com.example.shop.model.CategoryType;
import com.example.shop.repository.CategoryRepository;
import com.example.shop.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    private CategoryMapper categoryMapper;

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = categoryMapper.categoryDTOToCategory(categoryDTO);
        categoryRepository.save(category);
        return categoryMapper.categoryToCategoryDTO(category);
    }

    @Override
    public List<CategoryDTO> getCategories() {
        return categoryRepository.findAll().stream().map(categoryMapper::categoryToCategoryDTO).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()-> new RuntimeException("Nema Kategorije s tim id-em"));
        return categoryMapper.categoryToCategoryDTO(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }


}
