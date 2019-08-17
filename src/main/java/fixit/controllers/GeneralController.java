/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.controllers
 * File:    GeneralController.java
 * 
 * Description: Controller that handles the general routing to other sub-controllers
 *
 * @author Benjamin McDonnell (c3166457)
 */
package fixit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fixit.db.*;

@RestController
public class GeneralController {
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("dashboard");
		return mav;
	}
	
	@GetMapping("/tickets")
	public ModelAndView viewTickets() {
		ModelAndView mav = new ModelAndView("tickets");
		Dao dao = new Dao();
		mav.addObject("tickets", dao.getTickets());
		return mav;
	}
	
	@GetMapping("/tickets/{id}")
	public ModelAndView getTicket(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("ticket");
		Dao dao = new Dao();
		mav.addObject("ticket", dao.getTicket(id));
		return mav;
	}
	
	@GetMapping("/usermanagement")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("usermanagement");
		Dao dao = new Dao();
		mav.addObject("users", dao.getUsers());
		return mav;
	}

}
