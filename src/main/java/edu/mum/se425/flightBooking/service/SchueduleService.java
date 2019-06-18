package edu.mum.se425.flightBooking.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.se425.flightBooking.model.Schuedule;
import edu.mum.se425.flightBooking.repository.SchueduleRepository;

@Service
public class SchueduleService {
    @Autowired
    private SchueduleRepository schueduleRepository;

    public Schuedule SaveSchuedule(Schuedule schuedule){
         return schueduleRepository.save(schuedule);
    }
    public Schuedule  searchById( Long id)
    {
      return   schueduleRepository.getOne(id);
    }
    public List<Schuedule> searchAllSchuedule(){
       return schueduleRepository.findAll();
    }
    public  Schuedule  searchSchueduleById( Long id){
        return schueduleRepository.getOne(id);
    }
    public void  deleteSchueduleById(Long id){
        schueduleRepository.deleteById(id);
    }
    
    
    public List<Schuedule> availableFlights(Schuedule m){
    	
    	List<Schuedule> allFlights = searchAllSchuedule();
    	
    	List<Schuedule> availableFlights = new ArrayList<>();
    	for (Schuedule s : allFlights) {
			if((s.getDepartureAirport().equals(m.getDepartureAirport())) && (s.getArriavaleAirport().equals(m.getArriavaleAirport()))) {
				if((s.getDepartureDate().equals(m.getDepartureDate())) && (s.getArrivaleaDate().equals(m.getArrivaleaDate()))) {
					
					availableFlights.add(s);
				}
			}
		}
    	
    	return availableFlights;
    }
    
    
    
    
}

//List<Schuedule> scheduels = schueduleRepository.findAll();
//for (Schuedule s : scheduels) {
//	if(s.getDepartureAirport().equals(m.getDepartureAirport()) && (s.getArriavaleAirport().equals(m.getArriavaleAirport()))) {
//		if(s.getDepartureDate().equals(m.getDepartureDate()) && (s.getArrivaleaDate().equals(m.getArrivaleaDate()))) {
//			//will call another method to check flight availability
//			//call reserve method
//		}
//	}
//}