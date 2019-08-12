/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.launch
 * File:    FixIT.java
 * 
 * Description: The main launch file for the Spring boot application
 * 				Defines the controller components to be scanned
 *
 * @author Benjamin McDonnell (c3166457)
 */
package fixit.launch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "fixit.controllers"} )
public class FixIT {
	public static void main(String[] args) throws Exception {
	    SpringApplication.run(FixIT.class, args);
	  }
}
