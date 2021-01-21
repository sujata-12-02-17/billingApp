package com.techdenovo.app.billing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Currency {
    @Id
    private long id;
    private String code;
    private String country;
    private String value;//null byDefault
    private String status;
}
