package com.mohamed.springmaster.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
    private final long id;
    private final  String name;
    @JsonIgnore
    private final String password;


    public String getPassword() {
        return password;
    }


    public Customer(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    @JsonProperty("customer_id")
    public long getId() {
        return id;
    }

    public String getCustomerTwice(){
        return name + " plus " + name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
