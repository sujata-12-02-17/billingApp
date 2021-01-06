package com.techdenovo.app.billing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    private Long id;
    private String productName;
    private String description;
    private float price;
    private long stock;
    private String HSN;
    private String SAC;
    private Long productCode;
}

