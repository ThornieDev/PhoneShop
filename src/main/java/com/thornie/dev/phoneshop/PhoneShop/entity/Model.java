package com.thornie.dev.phoneshop.PhoneShop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "models")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    // Relationship
    /*
     * brand 1 -> more models
     * models n -> 1 brand
     * M->1 relationship
     */
    @ManyToOne
    @JoinColumn(name = "brandId")
    private Brand brand;
}
