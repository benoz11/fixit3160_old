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

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import fixit.db.*;

@RestController
public class GeneralController {

	@GetMapping("/")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView("test");
		Dao dao = new Dao();
		mav.addObject("users", dao.getUsers());
		return mav;
	}

}
