package com.example.shop.mapper;

import com.example.shop.dto.CategoryTypeDTO;
import com.example.shop.model.CategoryType;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses = CategoryMapper.class)
public interface CategoryTypeMapper {


    CategoryType categoryTypeDTOToCategoryType(CategoryTypeDTO categoryTypeDTO);


    CategoryTypeDTO categoryTypeToCategoryTypeDTO(CategoryType categoryType);

}
