package edu.mum.se425.flightBooking.service;
import edu.mum.se425.flightBooking.model.Schuedule;
import edu.mum.se425.flightBooking.repository.SchueduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}