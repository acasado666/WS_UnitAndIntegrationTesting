package com.ps.bk.hotel.booking.controller;

import com.ps.bk.hotel.booking.service.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

}
