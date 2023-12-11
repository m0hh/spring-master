package com.mohamed.springmaster.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository  implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
        new Customer(1L, "James Bond", "1234", "example@example.com"),
        new Customer(1L, "James Bond", "4321","example@example.com")
        );
    }

    @Override
    public Customer getCustmor(Long customerId) {
        return new Customer(customerId, "Get Customer", "4321","example@example.com");
    }
}
