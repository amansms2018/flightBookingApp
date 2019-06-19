package edu.mum.se425.flightBooking.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import edu.mum.se425.flightBooking.model.Airport;



@Repository
public interface AirportRepository extends  JpaRepository<Airport,Integer>{
 
	//List<Airport> findAllByOrderByAirportNameAsc();

}
