package com.mohamed.springmaster.customer;

import com.mohamed.springmaster.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;


    List<Customer> getCustomers()
    {
        log.info("getCustomers was called");
        return customerRepository.findAll();
    }
    Customer getCustomer(Long coustomerId){

        return customerRepository.findById(coustomerId).orElseThrow(() -> {
            NotFoundException notFoundException = new NotFoundException("customer with id " + coustomerId + " not found");
            log.error("error in getting customer {}", coustomerId, notFoundException);
            return  notFoundException;
            }

        );
    }
}
