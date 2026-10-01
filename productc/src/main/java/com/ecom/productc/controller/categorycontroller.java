package com.ecom.productc.controller;

import com.ecom.productc.model.category;
import com.ecom.productc.service.categoryservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins="http://localhost:5173")
public class categorycontroller {
    private categoryservice categoryService;

    public categorycontroller(categoryservice categoryService) {

        this.categoryService = categoryService;
    }

    @GetMapping
    public List<category>  getAllCategories(){
       List<category> categories=categoryService.getAllCategories();
        return categories;
    }
}
