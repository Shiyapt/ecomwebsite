package com.ecom.productc.repository;

import com.ecom.productc.model.category;
import com.ecom.productc.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface categoryrepository extends JpaRepository<category,Long> {

}
