package com.ecom.productc.repository;

import com.ecom.productc.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepository extends JpaRepository<product,Long> {

    List<product> findBycategoryId(Long categoryId);
}
