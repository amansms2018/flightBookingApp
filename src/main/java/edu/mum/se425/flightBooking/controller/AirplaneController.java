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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.se425.flightBooking.model.Airplane;
import edu.mum.se425.flightBooking.service.AirplaneService;




@Controller
@RequestMapping(value = "/airplanes")
public class AirplaneController {
	
	@Autowired
	//private AirplaneRepository airplaneRepository;
	private AirplaneService airplaneService;
	
	@GetMapping(value = "/list")
	public String getListOfAirplanes(Model model) {
		List<Airplane> planes = airplaneService.findAllAirplane();
		model.addAttribute("jets", planes);
		return "home/airplaneList";
	}
	
	//ordered list
	
	@GetMapping(value = "/orderedlist")
	public String getListOfOrderedAirplanes(Model model) {
		List<Airplane> planes = airplaneService.findOrderedAirplane();
		model.addAttribute("jets", planes);
		return "home/airplaneList";
	}
	
	
	//add a method to get the form data this is get mapping method
	@GetMapping(value = "/showForm")
	public String showFormForAdd(Model model) {
		Airplane plane = new Airplane();
		model.addAttribute("jets", plane);
		return "home/airplane-form";
	}
	
	//adding a method that saves the supplied data to the database
	@PostMapping(value = "/save")
	public String saveAirplane(@ModelAttribute("jets") Airplane airplane, BindingResult result) {
		if(result.hasErrors()) {
			return "error";
		}
		airplaneService.saveAirplane(airplane);
		return "redirect:/airplanes/list";
	}
	
	//update airplane
//	@GetMapping(value = "/edit")
//	public String editAirplane( @Valid @ModelAttribute("airplane") Airplane airplane, BindingResult result, Model model) {
//		if(result.hasErrors()) {
//			return "error";
//		}
//		model.addAttribute(airplane);
//		//airplane = airplaneService.saveAirplane(airplane);
//		return "redirect:home/updateForm";
//	}
	
	//adding a method that edits a list
	@GetMapping(value = "/update{id}")
	public String showFormForUpdate(@PathVariable(value = "id") Integer id, @Valid Airplane airplane, BindingResult result,  Model model) {
		if(result.hasErrors()) {
			airplane.setId(id);
			return "updateForm";
		}
		//get the airplane form the service
		airplaneService.saveAirplane(airplane);
		
		model.addAttribute("airplane", airplaneService.getAirplane(id));
	
		return "home/updateForm";
	}
	
	
	//deleteing airplane from the list
	@GetMapping(value ="/delete")
	public String deleteAirplane(@RequestParam("id") Integer theId) {
		//Airplane plane = airplaneService.getAirplane(theId);
		airplaneService.deletAirplane(theId);
		return "redirect:/airplanes/list";
		
	}
	
	
	
}
