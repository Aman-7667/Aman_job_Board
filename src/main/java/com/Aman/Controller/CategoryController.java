package com.Aman.Controller;

import com.Aman.dto.ResponseDto;
import com.Aman.dto.categoryDto;
import com.Aman.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/api/category")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> create (@RequestBody categoryDto categoryDto){
        categoryService.addCategory(categoryDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("201","Category is created Successfully!"));
    }
}
