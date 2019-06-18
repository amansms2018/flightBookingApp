package edu.mum.se425.flightBooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.se425.flightBooking.model.Airplane;



@Repository("AirplaneRepository")
public interface AirplaneRepository extends JpaRepository<Airplane, Integer>{
	public List<Airplane> findAllByOrderByCapacityAsc();
}
