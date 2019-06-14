package edu.mum.se425.flightBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ComponentScan
public class AboutUsController {
    @Autowired

    @GetMapping(value = "/")
    public  String displayHomepage(){
        return "admin/index";
    }

}
