package com.ecom.productc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class category {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
     private long id;
     private String name;


     @OneToMany(mappedBy = "category",
             cascade = CascadeType.ALL,
             fetch =FetchType.LAZY)
     @JsonIgnore
     private Set<product> product;
}
