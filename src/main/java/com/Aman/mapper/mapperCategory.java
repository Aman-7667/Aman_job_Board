package com.Aman.mapper;

import com.Aman.dto.categoryDto;
import com.Aman.entity.Category;


public class mapperCategory {
    public static categoryDto mapTocategoryDto(Category category, categoryDto categoryDto){
        categoryDto.setCategoryName(category.getCategoryName());
        categoryDto.setShortOrder(category.getSortOrder());
        categoryDto.setStatus(category.isStatus());
        return categoryDto;
    }
    public static Category mapTocategory(Category category, categoryDto categoryDto){
        category.setCategoryName(categoryDto.getCategoryName());
        category.setSortOrder(category.getSortOrder());
        category.setStatus(category.isStatus());
        return category;
    }
}
