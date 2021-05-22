package com.codeclan.example.courseBookingService.repositories;

import com.codeclan.example.courseBookingService.models.Booking;
import com.codeclan.example.courseBookingService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseNameIgnoreCase(String courseName);

    List<Customer> findByBookingsCourseNameIgnoreCaseAndTownIgnoreCase(String courseName, String town);

    List<Customer> findByBookingsCourseNameIgnoreCaseAndTownIgnoreCaseAndAgeGreaterThan(String courseName, String town, int age);
}
