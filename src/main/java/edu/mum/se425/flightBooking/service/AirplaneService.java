package edu.mum.se425.flightBooking.service;

import java.util.List;

import edu.mum.se425.flightBooking.model.Airplane;


public interface AirplaneService {
	Airplane saveAirplane(Airplane airplane);
	List<Airplane> findAllAirplane();
	Airplane getAirplane(Integer id);
	void deletAirplane(Integer id);
	public List<Airplane> findOrderedAirplane();
	Airplane updateById(Integer id);
}
