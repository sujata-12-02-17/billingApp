package com.techdenovo.app.billing.service;

import com.techdenovo.app.billing.Repositry.CategoryRepositry;
import com.techdenovo.app.billing.domain.Category;
import com.techdenovo.app.billing.domain.Message;
import com.techdenovo.app.billing.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepositry categoryRepositry;




    public List<Category> getCategories(){

        return categoryRepositry.findAll();
    }

    public Category getCategory(Long id){

        return  categoryRepositry.findById(id).orElse(null);

    }
    public Category addCategory(Category category){

        return  categoryRepositry.save(category);
    }

    public Category updateCategory(Category category){


        return categoryRepositry.save(category);
    }

    public Message deleteCategory(long id){
        Category category = categoryRepositry.findById(id).orElse(null);
        if(category!=null){
            categoryRepositry.deleteById(id);
            return new Message("Category Deleted Successfully....", true);
        }
        else {
            return new Message("Category does not exist",false);
        }
    }



}


