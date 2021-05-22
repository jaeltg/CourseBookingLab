package com.codeclan.example.courseBookingService;

import com.codeclan.example.courseBookingService.models.Customer;
import com.codeclan.example.courseBookingService.repositories.BookingRespository;
import com.codeclan.example.courseBookingService.repositories.CourseRepository;
import com.codeclan.example.courseBookingService.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingServiceApplicationTests {

	@Autowired
	BookingRespository bookingRespository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

}
