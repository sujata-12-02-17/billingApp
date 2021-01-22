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

    public Customer updateCustomer(Customer customer, long id){
         Customer existingCustomer=customerRepositry.findById(id).orElse(null);
         if(existingCustomer!=null) {
             existingCustomer.setFirstName(customer.getFirstName());
             existingCustomer.setLastName(customer.getLastName());
             existingCustomer.setEmail(customer.getEmail());
             existingCustomer.setMobileNo(customer.getMobileNo());
             existingCustomer.setAddress(customer.getAddress());
             existingCustomer.setGSTIN(customer.getGSTIN());
             existingCustomer.setCustomerCode(customer.getCustomerCode());

             existingCustomer.setPinCode(customer.getPinCode());

         }

        return customerRepositry.save(existingCustomer);
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