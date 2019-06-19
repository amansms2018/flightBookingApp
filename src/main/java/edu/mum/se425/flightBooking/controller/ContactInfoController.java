package edu.mum.se425.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mum.se425.flightBooking.model.ContactInfo;
import edu.mum.se425.flightBooking.serviceImpl.ContactInfoServiceImpl;




@Controller
public class ContactInfoController {

	@Autowired
	private ContactInfoServiceImpl impl;
	
	//showing list of messages to the admin
	@GetMapping(value="/list")
	public String showAllMessage(Model model) {
		List<ContactInfo> allMessages = impl.getListCustomerMessages();
		
		model.addAttribute("contacts", allMessages);
		return "home/contactList";
	}
	
	//displaying contact form for the user
	@GetMapping(value ="contactus")
	public String showContactForm(Model model) {
		ContactInfo contactInfo = new ContactInfo();
		model.addAttribute("info", contactInfo);
		
		return "customer/contactInfoForm";
	}
	
	
	//Saving customer messages to a database
	@PostMapping(value = "/save")
	public String sendMessage(@ModelAttribute("cust") ContactInfo message) {
		impl.sendMessage(message);
		return "redirect:/thanks"; //need to create thanks form
	}
}
