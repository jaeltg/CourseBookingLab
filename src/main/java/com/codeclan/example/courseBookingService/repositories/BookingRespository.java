package com.codeclan.example.courseBookingService.repositories;

import com.codeclan.example.courseBookingService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRespository extends JpaRepository<Booking, Long>{

    List<Booking> findByDate(LocalDate date);
}
