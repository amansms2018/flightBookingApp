package edu.mum.se425.flightBooking.repository;

import edu.mum.se425.flightBooking.model.Schuedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchueduleRepository   extends JpaRepository<Schuedule,Long> {
	
}
