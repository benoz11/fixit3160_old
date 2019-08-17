/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.rowmaps
 * File:    TicketMapper.java
 * 
 * Description: 
 *
 * @author Benjamin McDonnell (c3166457)
 */
package fixit.rowmaps;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fixit.beans.*;

public class TicketMapper implements RowMapper<Ticket>{
	@Override
	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ticket ticket = new Ticket();
 
        ticket.setName(rs.getString("name"));
        ticket.setDescription(rs.getString("description"));
        ticket.setState(rs.getString("state"));
        ticket.setPosterid(rs.getInt("posterid"));
        ticket.setCaseworkerid(rs.getInt("caseworkerid"));
        ticket.setId(rs.getInt("id"));
        ticket.setCreated(rs.getString("created"));
 
        return ticket;
	}
}
