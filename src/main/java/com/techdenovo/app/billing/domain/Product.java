package com.techdenovo.app.billing.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String productName;
    private String description;
    private float price;
    private Long stock;
    private String HSN;
    private String SAC;
    private Long productCode;








}

