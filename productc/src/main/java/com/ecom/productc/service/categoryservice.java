package com.ecom.productc.service;


import com.ecom.productc.model.category;
import com.ecom.productc.repository.categoryrepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class categoryservice {

    private categoryrepository categoryRepository;

    public categoryservice(categoryrepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<category> getAllCategories(){
            List<category> categ=categoryRepository.findAll();
            return categ;
    }
}
