package com.ecom.productc.controller;

import com.ecom.productc.model.category;
import com.ecom.productc.model.product;
import com.ecom.productc.service.productservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins="http://localhost:5173")
public class poductcontroller {
   private productservice productService;

    public poductcontroller(productservice productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<product>  getAllproducts(){
        List<product> prod=productService.getAllproducts();
        return prod;
    }

    @GetMapping("/category/{categoryId}")
    public List<product>  getAllproducts(@PathVariable Long categoryId){
        List<product> prod=productService.getproductsBycategory(categoryId);
        return prod;
    }


}
