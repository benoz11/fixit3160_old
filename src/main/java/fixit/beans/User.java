/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.beans
 * File:    User.java
 * 
 * Description: Defines a 'User' java bean
 *
 * @author Benjamin McDonnell (c3166457)
 */
package fixit.beans;

public class User implements java.io.Serializable{
	/*
	*	DB stores the user in this order
	*/
	String username;
	String role;
	String password;
	String name;
	int id;
	String created;
	
	public User() {}
	
	private static final long serialVersionUID = 1L;
	
	public String getUsername() {return username;}
	public String getRole() {return role;}
	public String getPassword() {return password;}
	public String getName() {return name;}
	public int getId() {return id;}
	public String getCreated() {return created;}
	
	public void setUsername(String username) {this.username = username;}
	public void setRole(String role) {this.role = role;}
	public void setPassword(String password) {this.password = password;}
	public void setName(String name) {this.name = name;}
	public void setId(int id) {this.id = id;}
	public void setCreated(String created) {this.created = created;}
}
