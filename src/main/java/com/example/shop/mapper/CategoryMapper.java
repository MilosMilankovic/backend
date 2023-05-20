package com.example.shop.mapper;


import com.example.shop.dto.CategoryDTO;
import com.example.shop.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {


    CategoryDTO categoryToCategoryDTO(Category category);

    @Mapping(target = "categoryTypeList", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "modifiedDate", ignore = true)
    Category categoryDTOToCategory(CategoryDTO categoryDTO);

}
