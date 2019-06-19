package edu.mum.se425.flightBooking.service;

import java.util.List;

import edu.mum.se425.flightBooking.model.Airport;


public interface AirportService {
	
	
	public Airport save(Airport airport);
	
	public Airport getAirportById(int id);
	
	public void delete(int id);
	
	public List<Airport> getAll();
		

}
