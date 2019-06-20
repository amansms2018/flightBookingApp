package edu.mum.se425.flightBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ComponentScan
public class AboutUsController {
    @Autowired

    @GetMapping(value = "/about")
    public  String displayCustomerHomepage(){
        return "customer/index";
    }
//    @GetMapping(value = "/c")
////    public  String displayCustomerHomepage(){
////        return "customer/index101";
////    }

    @GetMapping(value = "/")
    public  String displayHomepage(){
        return "admin/index123";
    }

    @GetMapping(value = "/home")
    public  String displayHomepage2(){
        return "admin/index";
    }
//    @GetMapping(value = "/newdate")
//    public  String myDatinfo(){
//        return "admin/myDate";
//    }


//    @PostMapping(value = "/addnewdate")
//    public  String addmyDatinfo(){
//
//        return "admin/MyDate";
//    }


}
