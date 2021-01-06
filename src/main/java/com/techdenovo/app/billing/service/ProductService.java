package com.techdenovo.app.billing.service;

import com.techdenovo.app.billing.Repositry.CustomerRepositry;
import com.techdenovo.app.billing.Repositry.ProductRepositry;
import com.techdenovo.app.billing.domain.Customer;
import com.techdenovo.app.billing.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

//    private ProductRepositry productRepositry;
//
//    public Product addProduct(Product product){
//
//        return  productRepositry.save(product);
//
//    }
//
//
//    public List<Product> getAllProduct(){
//
//        return productRepositry.findAll();
//    }
//    public Product getproductByid(Long id){
//
//        return  productRepositry.findById(id).orElse(null);
//
//
//    }
//
//    public Product updateProduct(Product product ,Long id){
//        Product existingProduct= productRepositry.findById(id).orElse(null);
//        if(existingProduct!=null){
//            existingProduct.setId(product.getId());
//            existingProduct.setProductName(product.getProductName());
//            existingProduct.setPrice(product.getPrice());
//            existingProduct.setRemark(product.getRemark());
//            existingProduct.setHSN(product.getHSN());
//            existingProduct.setSAC(product.getSAC());
//            existingProduct.setStock(product.getStock());
//
//        }
//        return productRepositry.save(existingProduct);
//
//
//    }
//    public String deleteProduct(Long id){
//        Product product = productRepositry.findById(id).orElse(null);
//        if(product!=null){
//            productRepositry.deleteById(id);
//            return "product Deleted Successfully....";
//        }
//        else {
//            return "customer does not exist";
//        }
//
//    }

}
