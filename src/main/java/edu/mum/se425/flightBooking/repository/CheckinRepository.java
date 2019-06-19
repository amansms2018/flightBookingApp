package edu.mum.se425.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.se425.flightBooking.model.Checkin;

public interface CheckinRepository extends JpaRepository<Checkin, Long> {

}
