package com.ecom.productc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String imgurl;
    private double price;

    @ManyToOne
    @JoinColumn(name="category_id",nullable=false)
    private category category;

}
