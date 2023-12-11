package com.mohamed.springmaster.customer;

import java.util.List;

public interface CustomerRepo {
    List<Customer> getCustomers();
    Customer getCustmor(Long customerId);
}
