package edu.mum.se425.flightBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mum.se425.flightBooking.model.Checkin;
import edu.mum.se425.flightBooking.serviceImpl.CheckinImpl;


@Controller
public class ChechInController {
	
	@Autowired
	private CheckinImpl impl;
	
	@GetMapping(value = "/showCheckinForm")
	public String showCheckinForm(Model model) {
		Checkin check = new Checkin();
		model.addAttribute("check", check);
		return "customer/checkinForm";
	}
	
	
	//Saving customer to DB
	@PostMapping(value ="/save")
	public String checkin(@ModelAttribute("check") Checkin checkin) {
		impl.checkin(checkin);
		return "redirect:/thankyou";
	}
}
