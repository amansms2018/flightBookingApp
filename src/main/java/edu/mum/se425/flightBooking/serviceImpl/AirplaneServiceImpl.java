package edu.mum.se425.flightBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.se425.flightBooking.model.Airplane;
import edu.mum.se425.flightBooking.repository.AirplaneRepository;
import edu.mum.se425.flightBooking.service.AirplaneService;




@Service
public class AirplaneServiceImpl implements AirplaneService{

	@Autowired
	private AirplaneRepository airplaneRepository;
	@Override
	public Airplane saveAirplane(Airplane airplane) {
		// TODO Auto-generated method stub
		return airplaneRepository.save(airplane);
	}

	@Override
	public List<Airplane> findAllAirplane() {
		// TODO Auto-generated method stub
		return airplaneRepository.findAll();
	}

	@Override
	public List<Airplane> findOrderedAirplane() {
		// TODO Auto-generated method stub
		return airplaneRepository.findAllByOrderByCapacityAsc();
	}
	
	@Override
	public Airplane getAirplane(Integer id) {
		// TODO Auto-generated method stub
		if(id != null) 
			return airplaneRepository.findById(id).get();
		return null;
	}

	@Override
	public void deletAirplane(Integer id) {
		// TODO Auto-generated method stub
		airplaneRepository.deleteById(id);
	}

	@Override
	public Airplane updateById(Integer id) {
		// TODO Auto-generated method stub
	Airplane airplane =	airplaneRepository.findById(id).get();
	return saveAirplane(airplane);
		
	}

}
