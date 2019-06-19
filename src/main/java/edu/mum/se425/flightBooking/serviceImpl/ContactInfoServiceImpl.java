package edu.mum.se425.flightBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.se425.flightBooking.model.ContactInfo;
import edu.mum.se425.flightBooking.repository.ContactInfoRepository;
import edu.mum.se425.flightBooking.service.ContactInfoService;



@Service
public class ContactInfoServiceImpl implements ContactInfoService{

	@Autowired
	private ContactInfoRepository contactRepo;
	@Override
	public List<ContactInfo> getListCustomerMessages() {
		// TODO Auto-generated method stub
		return contactRepo.findAll();
	}

	@Override
	public void sendMessage(ContactInfo message) {
		// TODO Auto-generated method stub
		contactRepo.save(message);
	}

}
