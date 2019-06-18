package edu.mum.se425.flightBooking.controller;//package edu.mum.cs5.airTicketbooking.controller;
//
//import edu.mum.cs5.airTicketbooking.model.Employee;
//import org.jboss.logging.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.io.IOException;
//import java.util.List;
//
//
//@Controller
//public class EmployeeController {
//
//	private static final Logger logger = Logger
//			.getLogger(EmployeeController.class);
//
//	public EmployeeController() {
//		System.out.println("EmployeeController()");
//	}
//
//
//
//	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
//	public ModelAndView newContact(ModelAndView model) {
//		Employee employee = new Employee();
//		model.addObject("employee", employee);
//		model.setViewName("EmployeeForm");
//		return model;
//	}
//
//	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
//	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
//		if (employee.getId() == 0) { // if employee id is 0 then creating the
//			// employee other updating the employee
//			employeeService.save(employee);
//		}
////		else {
////			employeeService.(employee).;
////		}
//		return new ModelAndView("redirect:/");
//	}
//
////	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
////	public ModelAndView deleteEmployee(HttpServletRequest request) {
////		int employeeId = Integer.parseInt(request.getParameter("id"));
////		employeeService.deleteEmployee(employeeId);
////		return new ModelAndView("redirect:/");
////	}
////
////	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
////	public ModelAndView editContact(HttpServletRequest request) {
////		int employeeId = Integer.parseInt(request.getParameter("id"));
////		Employee employee = employeeService.getEmployee(employeeId);
////		ModelAndView model = new ModelAndView("EmployeeForm");
////		model.addObject("employee", employee);
////
////		return model;
////	}
//
//}
