package com.mohamed.springmaster.customer;

import com.mohamed.springmaster.SpringmasterApplication;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
@Deprecated
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "all")
     List<Customer> getCustomer(){
        return customerService.getCustomers();
    }

    @PostMapping
    void createNewCustomer(@RequestBody @Valid Customer customer){
        System.out.println("POST requst");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE requst for customer with id " + id);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT requst");
        System.out.println(customer);
    }
}
