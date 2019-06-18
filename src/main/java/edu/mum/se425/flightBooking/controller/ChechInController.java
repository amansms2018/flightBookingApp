package edu.mum.se425.flightBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChechInController {
    @GetMapping(value = "/checkin")
    public  String checkIn(){
        return "services";
    }
}
