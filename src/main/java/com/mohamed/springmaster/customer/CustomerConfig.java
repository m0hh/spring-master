package com.mohamed.springmaster.customer;

import com.mohamed.springmaster.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfig {
    @Value("${app.useFakeCustomerRepo:false}")
    private  Boolean useFakeCustomerRepo;

    @Value("${info.company.name}")
    private String companyName;


    @Autowired
    private Environment environment;
    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp){
        return args -> {
            System.out.println("Command line runner hooray");
            System.out.println(companyName);
            System.out.println(environment.getProperty("info.app.version"));
            System.out.println(infoApp);
        };
    }
    @Bean
    CustomerRepo customerRepo(){
        System.out.println("FakeCustomerRepo = "+ useFakeCustomerRepo);
//        return useFakeCustomerRepo ?
//                new CustomerFakeRepository() :
//                new CustomerRepository();
        return new CustomerFakeRepository();
    }
}
