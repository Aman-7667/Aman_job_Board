package com.Aman.service.impl;

import com.Aman.dto.categoryDto;
import com.Aman.entity.Category;
import com.Aman.mapper.mapperCategory;
import com.Aman.rapositoy.categoryrepositry;
import com.Aman.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceimpl implements CategoryService {

    @Autowired
    private categoryrepositry categoryrepositry;

    @Override
    public void addCategory(categoryDto categoryDto) {
        Category category = mapperCategory.mapTocategory(new Category(), categoryDto);
        categoryrepositry.save(category);

    }

    @Override
    public List<categoryDto> getAllCategories() {
        List<Category> categories = categoryrepositry.findAll();
        List<categoryDto> categoryDtos = new ArrayList<>();
        for (Category category : categories) {
            categoryDto categoryDto = mapperCategory.mapTocategoryDto(category, new categoryDto());
            categoryDtos.add(categoryDto);
        }
        return categoryDtos;
    }
}