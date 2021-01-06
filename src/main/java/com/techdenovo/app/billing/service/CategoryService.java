package com.techdenovo.app.billing.service;

import com.techdenovo.app.billing.Repositry.CategoryRepositry;
import com.techdenovo.app.billing.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepositry categoryRepositry;


    public Category addCategory(Category category){

        return  categoryRepositry.save(category);
    }





}


