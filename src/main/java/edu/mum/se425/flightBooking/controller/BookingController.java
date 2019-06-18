package edu.mum.se425.flightBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {
    @GetMapping(value = "/book1")
    public  String bookingUrl(){
        return "/customer/booknew";
    }

}
