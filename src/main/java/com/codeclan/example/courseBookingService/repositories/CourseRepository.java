package com.codeclan.example.courseBookingService.repositories;

import com.codeclan.example.courseBookingService.models.Booking;
import com.codeclan.example.courseBookingService.models.Course;
import com.codeclan.example.courseBookingService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(int rating);

    List<Course> findByBookingsCustomerNameIgnoreCase(String customerName);
}
