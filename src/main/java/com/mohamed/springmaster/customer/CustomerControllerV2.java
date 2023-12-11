package com.mohamed.springmaster.customer;

import com.mohamed.springmaster.exception.APIRequestException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v2/customer")
@AllArgsConstructor
public class CustomerControllerV2 {
    private CustomerService customerService;

    @GetMapping(value = "all")
     List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping(path = "{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long customerId){
        return customerService.getCustomer(customerId);
    }
    @GetMapping(path = "{customerId}/exception")
    Customer getCustomerExeption(@PathVariable("customerId") Long customerId){
        throw new APIRequestException("ApiRequest Exception for customer " + customerId);
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
