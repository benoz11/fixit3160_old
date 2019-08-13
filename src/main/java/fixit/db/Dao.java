/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.db
 * File:    Dao.java
 * 
 * Description: Data access object - Handles all database accessing for the program
 *
 * @author Benjamin McDonnell (c3166457)
 */
package fixit.db;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import fixit.beans.*;
import fixit.rowmaps.UserMapper;    

public class Dao {
	
	private static String DB_DRIVER = "org.postgresql.Driver";
	private static String DB_USER = "qbjosxuxuthptx";
	private static String DB_PASS = "9662c9f1a2bc9fb187804b81b9f513c7fcec066d7b9a8e9f47cdb96cb69f8f13";
	private static String DB_URL = "jdbc:postgresql://ec2-54-243-238-226.compute-1.amazonaws.com:5432/dalob4q95vnv38";
	
	private DriverManagerDataSource dmds;
	private JdbcTemplate jdbcTemplateObject;
	private static EntityManager em = null;
	
	public static void setUpClass() throws Exception {
		
	}

	public DriverManagerDataSource getDS() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(DB_DRIVER);
		dmds.setPassword(DB_PASS);
		dmds.setUrl(DB_URL);
		dmds.setUsername(DB_USER);
		return dmds;
	}
	
	public List<User> getUsers() {
		dmds = getDS();
		jdbcTemplateObject = new JdbcTemplate(dmds);
		return jdbcTemplateObject.query("SELECT * FROM public.\"Users\"", new UserMapper());
	}

}
