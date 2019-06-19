package edu.mum.se425.flightBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.se425.flightBooking.model.Checkin;
import edu.mum.se425.flightBooking.model.Passenger;
import edu.mum.se425.flightBooking.repository.CheckinRepository;
import edu.mum.se425.flightBooking.service.CheckinService;
import edu.mum.se425.flightBooking.service.PassengerService;


@Service
public class CheckinImpl implements CheckinService{

	@Autowired
	private CheckinRepository chRepo;
	
	@Autowired
	private PassengerService passService;
	
	@Override
	public void checkin(Checkin c) {
		List<Passenger> passengers = passService.getPassenger();
		
		for (Passenger p : passengers) {
			if((p.getPassengerLastName().equals(c.getLastName())) && (p.getEmail().equals(c.getEmail())) ) {
				addCheckin(c);
			}
		}
		
	}

	@Override
	public void addCheckin(Checkin ch) {
		// TODO Auto-generated method stub
		chRepo.save(ch);
		
	}

	@Override
	public List<Checkin> allCheckins() {
		// TODO Auto-generated method stub
		return chRepo.findAll();
	}

}
