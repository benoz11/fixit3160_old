/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.beans
 * File:    Ticket.java
 * 
 * Description: Defines a 'Ticket' java bean - Knowledge Base Articles are also Tickets
 * 
 * @author Benjamin McDonnell (c3166457)
 */
package fixit.beans;

import java.io.Serializable;

public class Ticket implements Serializable{
	/*
	*	DB stores the ticket in this order
	*/
	
	String name;
	String description;
	String state;
	int posterid;
	int caseworkerid;
	int id; //ticketid
	String created;
	
	public Ticket() {}
	
	public Ticket(String name, String description, String state, int posterid, int caseworkerid, int id,
			String created) {
		super();
		this.name = name;
		this.description = description;
		this.state = state;
		this.posterid = posterid;
		this.caseworkerid = caseworkerid;
		this.id = id;
		this.created = created;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPosterid() {
		return posterid;
	}
	public void setPosterid(int posterid) {
		this.posterid = posterid;
	}
	public int getCaseworkerid() {
		return caseworkerid;
	}
	public void setCaseworkerid(int caseworkerid) {
		this.caseworkerid = caseworkerid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	
}
