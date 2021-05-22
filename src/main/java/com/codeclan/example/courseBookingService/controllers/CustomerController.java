package com.codeclan.example.courseBookingService.controllers;

import com.codeclan.example.courseBookingService.models.Customer;
import com.codeclan.example.courseBookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> findCustomersFiltered(
            @RequestParam(name = "courseName", required = false)
                    String courseName,
            @RequestParam(name = "town", required = false)
                    String town,
            @RequestParam(name = "age", required = false)
                    Integer age
    ){

        if(town != null && courseName != null && age != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseNameIgnoreCaseAndTownIgnoreCaseAndAgeGreaterThan(courseName, town, age), HttpStatus.OK);
        }

        if(town != null && courseName != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseNameIgnoreCaseAndTownIgnoreCase(courseName, town), HttpStatus.OK);
        }

        if(courseName != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseNameIgnoreCase(courseName), HttpStatus.OK);
        }


        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}



