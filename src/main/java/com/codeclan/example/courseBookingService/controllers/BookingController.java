package com.codeclan.example.courseBookingService.controllers;


import com.codeclan.example.courseBookingService.models.Booking;
import com.codeclan.example.courseBookingService.repositories.BookingRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    BookingRespository bookingRespository;

    @GetMapping(value = "/bookings")
    public ResponseEntity<List<Booking>> findBookingFiltered(
            @RequestParam(name = "date", required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ){
        if (date != null){
            return new ResponseEntity<>(bookingRespository.findByDate(date), HttpStatus.OK);
        }
        return new ResponseEntity<>(bookingRespository.findAll(), HttpStatus.OK);
    }


}
