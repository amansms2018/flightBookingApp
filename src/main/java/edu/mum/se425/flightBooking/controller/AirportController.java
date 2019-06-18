package edu.mum.se425.flightBooking.controller;

import edu.mum.se425.flightBooking.model.Airport;
import edu.mum.se425.flightBooking.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@ComponentScan
public class AirportController {
    @Autowired
    AirportService airportService;
    @GetMapping(value="/newAirport")
    public String recordAirport(ModelMap model) {
        Airport airport = new Airport();
        model.addAttribute("airport",airport);
        return "admin/addairport";
    }
    @PostMapping(value="/saveAirport")
    public String saveRegistration(@Valid Airport airport, BindingResult result, ModelMap model, RedirectAttributes redirectAttributes) {
        airportService.save(airport);
        return "redirect:/airport/list";
    }
    @GetMapping(value = "/airport/list")
    public ModelAndView getAll() {
        List<Airport> airports = airportService.searchAll();
        return new ModelAndView("admin/airportList", "airports", airports);
    }


//    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
//    public String editsave(@ModelAttribute("airport") Airport ap) {
//        Airport airport = airportService.findOne(ap.getAirportCode());
//        airport.setAirportCode(ap.getAirportCode());
//        airport.setAirportName(ap.getAirportName());
//        airport.setCountry(ap.getCountry());
//        airportService.save(airport);
//        return  "redirect:/airport/list";
//    }
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String displayHomapage() {
//        return "index";
//    }
    @RequestMapping(value = "/deleteairport/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable String code) {
        Airport airport = airportService.findOne(code);
        airportService.delete(airport);
        return  "redirect:/book/list";
    }
//
//    @RequestMapping(value = "/editairport/{id}")
//    public String edit(@PathVariable String code, ModelMap model) {
//
//        Airport airport = airportService.findOne(code);
//        model.addAttribute("airport", airport);
//        return "editairport";
//    }



}
