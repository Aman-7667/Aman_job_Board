package com.Aman.service;

import com.Aman.dto.categoryDto;

import java.util.List;

public interface CategoryService {
    void addCategory(categoryDto categoryDto);
    List<categoryDto> getAllCategories();
}
