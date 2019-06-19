package edu.mum.se425.flightBooking.service;

import edu.mum.se425.flightBooking.model.Reservation;
import edu.mum.se425.flightBooking.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    public String  saveReservation(Reservation reservation){
         reservationRepository.save(reservation);
      return "booking reservation done>>>";
    }
//
//    public String  cancelReservation(Reservation reservation){
//        reservationRepository.save(reservation);
//        return "booking reservation done>>>";
//    }
}
