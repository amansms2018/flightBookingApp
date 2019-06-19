package edu.mum.se425.flightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.mum.se425.flightBooking.model.ContactInfo;



@Repository("ContactInfRepository")
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {

}
