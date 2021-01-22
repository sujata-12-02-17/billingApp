package com.techdenovo.app.billing.Controller;

import com.techdenovo.app.billing.domain.Customer;
import com.techdenovo.app.billing.domain.Message;
import com.techdenovo.app.billing.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/")
public class CustomerController {

        @Autowired
        CustomerService customerService;


        @GetMapping("get-customer")
        public List<Customer> getCustomers() {
            return customerService.getCustomers();
        }

        @PostMapping("add-customer")
        public Customer addCustomer(@RequestBody Customer customer) {
            return customerService.addCustomer(customer);
        }

        @GetMapping("get-customer/{id}")
        public Customer getCustomer(@PathVariable ( value = "id") long id){
            return customerService.getCustomer(id);
        }

        @PutMapping("update-customer")
        public Customer updateCustomer(@ModelAttribute Customer customer ) {
            return customerService.updateCustomer(customer, customer.getId());
        }

        @DeleteMapping("delete-customer/{id}")
        public Message deleteCustomer(@PathVariable long id){
            return customerService.deleteCustomer(id);
        }
    }

