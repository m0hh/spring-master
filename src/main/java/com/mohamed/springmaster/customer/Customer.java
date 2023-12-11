package com.mohamed.springmaster.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {
    @Id
    private long id;
    @NotBlank(message = "name must not be blank")
    private  String name;
    @NotBlank(message = "password  must not be blank")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  String password;

    @NotBlank(message = "Email must not be blank")
    @Email
    private  String email;


    public String getPassword() {
        return password;
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



    public String getEmail() {
        return email;
    }
}
