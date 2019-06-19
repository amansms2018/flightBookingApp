package edu.mum.se425.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.mum.se425.flightBooking.model.ContactInfo;
import edu.mum.se425.flightBooking.serviceImpl.ContactInfoServiceImpl;



@Controller
public class ContactInfoController {

	@Autowired
	private ContactInfoServiceImpl impl;
	
	
	@GetMapping(value="/list")
	public String showAllMessage(Model model) {
		List<ContactInfo> allMessages = impl.getListCustomerMessages();
		
		model.addAttribute("contacts", allMessages);
		return "home/contactList";
	}
}
