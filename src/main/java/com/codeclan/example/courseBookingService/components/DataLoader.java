package com.codeclan.example.courseBookingService.components;

import com.codeclan.example.courseBookingService.models.Booking;
import com.codeclan.example.courseBookingService.models.Course;
import com.codeclan.example.courseBookingService.models.Customer;
import com.codeclan.example.courseBookingService.repositories.BookingRespository;
import com.codeclan.example.courseBookingService.repositories.CourseRepository;
import com.codeclan.example.courseBookingService.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRespository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Intro to Python", "Edinburgh", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Intro to Java", "Glasgow", 2);
        courseRepository.save(course2);

        Course course3 = new Course("Intro to JavaScript", "Edinburgh", 5);
        courseRepository.save(course3);

        Course course4 = new Course("Advanced Python", "Edinburgh", 4);
        courseRepository.save(course4);

        Course course5 = new Course("Intermediate Java", "Glasgow", 3);
        courseRepository.save(course5);

        Customer customer1 = new Customer("Jenny", "Edinburgh", 27);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Melissa", "Glasgow", 32);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Laura", "Edinburgh", 41);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Gabriel", "Glasgow", 23);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("John", "Edinburgh", 28);
        customerRepository.save(customer5);

        Customer customer6 = new Customer("Peter", "Glasgow", 35);
        customerRepository.save(customer6);

        Customer customer7 = new Customer("Luke", "Edinburgh", 18);
        customerRepository.save(customer7);

        LocalDate date1 = LocalDate.of(2021, 6, 1);
        LocalDate date2 = LocalDate.of(2021, 6, 2);
        LocalDate date3 = LocalDate.of(2021, 6, 3);


        Booking booking1 = new Booking(date1, course1, customer1);
        bookingRepository.save(booking1);

       Booking booking2 = new Booking(date1, course2, customer2);
        bookingRepository.save(booking2);

       Booking booking3 = new Booking(date1, course3, customer3);
        bookingRepository.save(booking3);

       Booking booking4 = new Booking(date2, course4, customer4);
        bookingRepository.save(booking4);

       Booking booking5 = new Booking(date2, course5, customer5);
        bookingRepository.save(booking5);

       Booking booking6 = new Booking(date2, course1, customer6);
        bookingRepository.save(booking6);

       Booking booking7 = new Booking(date3, course2, customer1);
        bookingRepository.save(booking7);

       Booking booking8 = new Booking(date3, course3, customer2);
        bookingRepository.save(booking8);

        Booking booking9 = new Booking(date1, course1, customer7);
        bookingRepository.save(booking9);


    }
}
