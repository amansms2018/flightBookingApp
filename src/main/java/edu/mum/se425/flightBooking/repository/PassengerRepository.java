package edu.mum.se425.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.se425.flightBooking.model.Passenger;



@Repository
public interface PassengerRepository  extends JpaRepository<Passenger, Integer>{

}
