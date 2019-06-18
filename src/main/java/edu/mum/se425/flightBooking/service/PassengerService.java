package edu.mum.se425.flightBooking.service;


import java.util.List;

import edu.mum.se425.flightBooking.model.Passenger;



public interface PassengerService {
	
	
	
    public List<Passenger> getPassenger();
	
	public Passenger addNewPassenger(Passenger passenger);
	
	public Passenger updatePassenger(int id);
	
	
	public Passenger getPassengerById(int id);
	
	public void delete(int id);


}
