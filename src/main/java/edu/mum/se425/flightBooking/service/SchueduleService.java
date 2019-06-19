package edu.mum.se425.flightBooking.service;
import edu.mum.se425.flightBooking.model.Schuedule;
import edu.mum.se425.flightBooking.repository.SchueduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

        if (allFlights!=null)
            System.out.println("--------\n\nThis is mukara Three-----" + allFlights.get(0).toString());


        List<Schuedule> availableFlights = new ArrayList<>();
        for (Schuedule s : allFlights) {
            if((s.getDepartureAirport().equals(m.getDepartureAirport())) &&
                    (s.getArriavaleAirport().equals(m.getArriavaleAirport()))) {
                if((s.getDepartureDate().isEqual(m.getDepartureDate())) &&
                        (s.getArrivaleaDate().isEqual(m.getArrivaleaDate()))) {
                    availableFlights.add(s);
                }
            }
        }

        if (availableFlights.size()>0) {
            for (Schuedule s: availableFlights) {
                System.out.println("I am not Null");
                System.out.println("\n\n Mukara Two" +  s.getDepartureAirport());
            }
        }
        return availableFlights;
    }



}