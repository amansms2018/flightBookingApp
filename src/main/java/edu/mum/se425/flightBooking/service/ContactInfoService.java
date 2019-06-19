package edu.mum.se425.flightBooking.service;

import java.util.List;

import edu.mum.se425.flightBooking.model.ContactInfo;



public interface ContactInfoService {
	
	
	
	public List<ContactInfo> getListCustomerMessages();
	
	public void sendMessage(ContactInfo message);
	
	//public void addMessage(ContactInfo info);
	
}
