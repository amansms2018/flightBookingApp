package edu.mum.se425.flightBooking.service;
import edu.mum.se425.flightBooking.model.Airport;
import edu.mum.se425.flightBooking.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public  class AirportService    {
    @Autowired
    AirportRepository airportRepository;

    public void save( Airport airport) {
         airportRepository.save(airport);
    }
    public List<Airport> searchAll() {
        return airportRepository.findAll();
    }

    public Airport findOne(String code) {
        return airportRepository.getOne(code);
    }

    public long count() {
        return  airportRepository.count() ;
    }
    public void delete(Airport airport) {
    }
}
