package edu.mum.se425.flightBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlaneController {
    @GetMapping(value = "/plane")
    public  String planePage(){
        return "admin/plane";
    }

}
