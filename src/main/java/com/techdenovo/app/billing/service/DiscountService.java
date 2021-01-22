package com.techdenovo.app.billing.service;


import com.techdenovo.app.billing.Repositry.DiscountRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    DiscountRepositry discountRepositry;



}
