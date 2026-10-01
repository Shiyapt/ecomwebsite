package com.ecom.productc.service;

import com.ecom.productc.model.category;
import com.ecom.productc.model.product;
import com.ecom.productc.repository.categoryrepository;
import com.ecom.productc.repository.productRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class productservice {
    private productRepository productrepository;

    public productservice(productRepository productrepository) {
        this.productrepository = productrepository;
    }

    public List<product> getAllproducts() {
        List<product>  prod=productrepository.findAll();
        return prod;
    }

    public List<product> getproductsBycategory(Long category_id){
        return productrepository.findBycategoryId(category_id);
    }

}
