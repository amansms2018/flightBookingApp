package edu.mum.se425.flightBooking.controller;

import java.util.List;



//import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.se425.flightBooking.model.Airport;
import edu.mum.se425.flightBooking.service.AirportService;




@Controller
public class AirportController {
//	@Autowired
//	private AirportService airportService;
//
//	// showing list of airports
//	@GetMapping(value="/list")
//	public ModelAndView listAirports() {
//		ModelAndView mav=new ModelAndView();
//
//			// get the airports from the db
//		List<Airport> airports= airportService.getAll();
//		mav.addObject("airports", airports);
//		mav.setViewName("airport/listOfAirports");
//	      return mav;
//	}
//
//	//2
//	@GetMapping("/new")
//	public String addNewAirport(Model model) {
//
//		// create model attribute to bind form dat
//		Airport airport=new Airport();
//		model.addAttribute("airport", airport);
//		return "airport/addNewAirport";
//	}
//
//	//3
//
//	@PostMapping("/save")
//	public String saveAirport(@Valid @ModelAttribute("airport") Airport airport,
//			BindingResult result, Model model) {
//
//		if(result.hasErrors()) {
//			model.addAttribute("error", result.getAllErrors());
//			return "airport/addNewAirport";
//		}
//
//		//save the airport
//		airport=airportService.save(airport);
//		//use a redirect to prevent duplicate submissions
//		return "redirect:/list";
//	}
//
//
//
//	@RequestMapping("/edit/{airportId}")
//	public ModelAndView UpdateAirport(@PathVariable(name="airportId") int airportId) {
//		//System.out.println("Robiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
//		Airport airport=airportService.getAirportById(airportId);
//		ModelAndView mav= new ModelAndView("airport/updateAirport-form");
//	    mav.addObject("airport",airport);
//	    return mav;
//
//	}
//
//
//	// deleting a airport
//		@RequestMapping(value="/delete/{airportId}", method = RequestMethod.GET)
//		public String deleteAirport(@PathVariable(name="airportId")  int airportId){
//			airportService.delete(airportId);
//			return "redirect:/list";
//		}
		
}
