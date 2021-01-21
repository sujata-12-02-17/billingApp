package com.techdenovo.app.billing.service;

import com.techdenovo.app.billing.Repositry.CustomerRepositry;
import com.techdenovo.app.billing.domain.Customer;

import com.techdenovo.app.billing.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepositry customerRepositry;

    public List<Customer> getCustomers(){

        return customerRepositry.findAll();
    }

    public Customer getCustomer(long id){

        return customerRepositry.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer){

        return  customerRepositry.save(customer);
    }

    public Customer updateCustomer(Customer customer){





        return customerRepositry.save(customer);
    }

    public Message deleteCustomer(long id){
        Customer customer = customerRepositry.findById(id).orElse(null);
        if(customer!=null){
            customerRepositry.deleteById(id);
            return new Message("Customer Deleted Successfully....", true);
        }
        else {
            return new Message("Customer does not exist",false);
        }
    }
}