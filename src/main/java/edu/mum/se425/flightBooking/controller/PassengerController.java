package edu.mum.se425.flightBooking.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.se425.flightBooking.model.Passenger;
import edu.mum.se425.flightBooking.serviceImpl.PassengerServiceImpl;


@Controller
public class PassengerController {
	
	
	@Autowired
	private PassengerServiceImpl passengerServiceImpl;
	
	//showing list of passengers
	@GetMapping(value="/list")
	public ModelAndView listofPassengers() {
		ModelAndView mav= new ModelAndView();
		List<Passenger> passengers=passengerServiceImpl.getPassenger();
		mav.addObject("passengers", passengers);
		mav.setViewName("passenger/listOfPassengers");
	    
		return mav;
	}
	
	
	//adding new passenger
	
	@GetMapping("/new")
	public String addNewPassenger(Model model) {
		Passenger passenger=new Passenger();
		model.addAttribute("passenger", passenger);
		
		return  "passenger/addNewPassenger";
	}
	
	
	//saving new passenger
	@PostMapping("/save")
	public String saveAirport(@Valid @ModelAttribute("passenger") Passenger passenger,
			               BindingResult result,Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("error", result.getAllErrors());
			return "airport/addNewPassenger";
		}
		
		//save the passenger
		passenger=passengerServiceImpl.addNewPassenger(passenger);
	    // use a redirect to prevent duplicate submission
		return "redirect:/list";
	}
	
	//updating passenger information
	
	@RequestMapping("/edit/{id}")
	public ModelAndView updatePassenger(@PathVariable(name="id") int id) {

		Passenger passenger=passengerServiceImpl.updatePassenger(id);
		ModelAndView mav=new ModelAndView("passenger/updatePassenger-form");
		mav.addObject("passenger", passenger);
		return mav;
		
		
	}
		
	
	
	@GetMapping("/delete/{id}")
	public String deletePassenger(@PathVariable("id") int id) {
		passengerServiceImpl.delete(id);
		
		return "redirect:/list";
	}
	

}
