package edu.mum.se425.flightBooking.controller;

import edu.mum.se425.flightBooking.model.Airport;
import edu.mum.se425.flightBooking.model.Schuedule;
import edu.mum.se425.flightBooking.repository.AirportRepository;
import edu.mum.se425.flightBooking.service.SchueduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SchueduleController {

    @Autowired
    AirportRepository airportRepository;
    @Autowired
    SchueduleService schueduleService;
    ////

    @GetMapping(value = "/newSchuedule")
    public String newProductForm(Model model) {
        List<Airport> airports = airportRepository.findAll();
        model.addAttribute("schuedule", new Schuedule());
        model.addAttribute("airports", airports);
        return "admin/newSchedule2";
    }

    @PostMapping(value = "/saveSchuedule")
    public String addNewProduct(@Valid @ModelAttribute("schuedule") Schuedule schuedule,
                                BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            model.addAttribute("errors", bindingResult.getAllErrors());
//            List<Airport> airports = airportRepository.findAll();
//            model.addAttribute("airports", airports);
//            return "admin/addSchuedulingPage";
//        }
      schueduleService.SaveSchuedule(schuedule);
        return "redirect:/admin/schueduleList";
    }

//    /////
//    @GetMapping(value="/newSchuedule")
//    public String recordingSchuedule(ModelMap model) {
//        Schuedule schuedule = new Schuedule();
//        model.addAttribute("schuedule",schuedule);
//        return "admin/addSchuedulingPage";
//    }
//    @PostMapping(value="/saveSchuedule")
//    public String saveSchuedule(@Valid Schuedule schuedule, BindingResult result, ModelMap model, RedirectAttributes redirectAttributes) {
//        schueduleService.SaveSchuedule(schuedule);
//        return "redirect:/admin/schueduleList";
//    }
//
//    @PostMapping(value="/saveSchuedule")
//    public String saveSchuedule(@Valid @ModelAttribute("schuedule") Schuedule schuedule ,BindingResult bindingResult , ModelMap model) {
//
//        if (bindingResult.hasErrors()) {
//            model.addAttribute( "errors", bindingResult.getAllErrors());
//            model.addAttribute("airports", airportRepository.findAll(Sort.by("airportCode")));
//
//        }
//
//        schueduleService.SaveSchuedule(schuedule);
//        return "redirect:/admin/schueduleList";
//    }
    @GetMapping(value = "/admin/schueduleList")
    public ModelAndView getAll() {
        List<Schuedule> schuedules = schueduleService.searchAllSchuedule();
        return new ModelAndView("admin/schueduleList", "schuedules", schuedules);
    }
//
//    @RequestMapping(value="/editschuedule/{id}")
//    public String edit (@PathVariable Long id,ModelMap model) {
//        Schuedule schuedule=schueduleService.searchById(id);
//        model.addAttribute("schuedule",schuedule);
//        return "admin/editschuedule";
//    }

    @PostMapping(value = "/editsave")
    public String editsave(@ModelAttribute("schuedule") Schuedule p) {
        Schuedule schuedule = schueduleService.searchById(p.getId());
        schuedule.setDepartureAirport(p.getDepartureAirport());
        schuedule.setDepartureDate(p.getDepartureDate());
//        schuedule.setDepartureTime(p.getDepartureTime());
        schuedule.setArriavaleAirport(p.getArriavaleAirport());
//        schuedule.setArrivaleTime(p.getArrivaleTime());
        schuedule.setArrivaleaDate(p.getArrivaleaDate());
        schuedule.setPrice(p.getPrice());

        schueduleService.SaveSchuedule(schuedule);
        return "redirect:/schuedule/list";
    }

    @RequestMapping(value="/deleteschuedule/{id}",method=RequestMethod.GET)
    public String delete(@PathVariable Long id) {
        schueduleService.deleteSchueduleById(id);
        return "redirect:/admin/schueduleList";
    }

    
    //creating flight search method
    @GetMapping(value ="/search")
    public List<Schuedule> searchFlight(Schuedule s) {
    	
    	return schueduleService.availableFlights(s);
    }
//
//

}
