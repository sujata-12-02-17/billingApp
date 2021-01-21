package com.techdenovo.app.billing.service;

import com.techdenovo.app.billing.Repositry.CustomerRepositry;
import com.techdenovo.app.billing.Repositry.ProductRepositry;
import com.techdenovo.app.billing.domain.Customer;
import com.techdenovo.app.billing.domain.Message;
import com.techdenovo.app.billing.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired

    private ProductRepositry productRepositry;



    public List<Product> getProducts(){

        return productRepositry.findAll();
    }

    public Product getProduct(Long id){

        return  productRepositry.findById(id).orElse(null);

    }


    public Product addProduct(Product product){
        return  productRepositry.save(product);
    }

    public Product updateProduct(Product product){
        return productRepositry.save(product);
    }

    public Message deleteProduct(long id){
        Product product = productRepositry.findById(id).orElse(null);
        if(product!=null){
            productRepositry.deleteById(id);
            return new Message("Customer Deleted Successfully....", true);
        }
        else {
            return new Message("Customer does not exist",false);
        }
    }

    }


