package com.techdenovo.app.billing.Controller;

import com.techdenovo.app.billing.Repositry.ProductRepositry;
import com.techdenovo.app.billing.domain.Customer;
import com.techdenovo.app.billing.domain.Message;
import com.techdenovo.app.billing.domain.Product;
import com.techdenovo.app.billing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/abc/")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping("get-product")
    public List<Product> getProducts() {

        return productService.getProducts();
    }

    @PostMapping("add-product")
    public Product addProduct(@RequestBody Product product) {

        return productService.addProduct(product);
    }

    @GetMapping("get-product/{id}")
    public Product getProduct(@PathVariable ( value = "id") long id){


        return productService.getProduct(id);
    }

    @PutMapping("update-product")
    public Product updateProduct(@RequestBody Product product) {


        return productService.updateProduct(product);
    }

    @DeleteMapping("delete-product/{id}")
    public Message deleteProduct(@PathVariable long id){


        return productService.deleteProduct(id);
    }
}





