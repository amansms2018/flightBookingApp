package edu.mum.se425.flightBooking.repository;

import edu.mum.se425.flightBooking.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository  extends JpaRepository<Airport, String> {


}
