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
public class Discount {
    @Id
    private Long id;
    private String discountCode;
    private String typeOfDiscount;
}
