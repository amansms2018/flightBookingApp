package edu.mum.se425.flightBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class crewController {

    @GetMapping(value = "/crew")
    public  String crewPage(){
        return   "admin/crew";
    }
}
