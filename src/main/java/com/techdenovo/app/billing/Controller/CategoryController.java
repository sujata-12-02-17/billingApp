package com.techdenovo.app.billing.Controller;

import com.techdenovo.app.billing.domain.Category;
import com.techdenovo.app.billing.domain.Message;
import com.techdenovo.app.billing.domain.Product;
import com.techdenovo.app.billing.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/pqr")
@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("get-category")
    public List<Category> getCategories() {

        return categoryService.getCategories();
    }

    @PostMapping("add-category")
    public Category addCategory(@RequestBody Category category) {

        return categoryService.addCategory(category);
    }




    @GetMapping("get-category/{id}")
    public Category getCategory(@PathVariable ( value = "id") long id){

        return categoryService.getCategory(id);
    }

    @PutMapping("update-Category")
    public Category updateCategory(@RequestBody Category category) {

        return categoryService.updateCategory(category);
    }

    @DeleteMapping("delete-category/{id}")
    public Message deleteCategory(@PathVariable long id){


        return categoryService.deleteCategory(id);
    }
}









