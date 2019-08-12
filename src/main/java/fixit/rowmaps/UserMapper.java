/*
 * FixIT - Project for University of Newcastle - 2019 - SENG3150 SENG3160
 * Benjamin McDonnell, Jordan Maddock, Matthew Rudge, Kundayi Sitole
 *
 * Project: FixIT-Spring
 * Package: fixit.rowmaps
 * File:    UserMapper.java
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

public class UserMapper implements RowMapper<User>{
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
 
        user.setUsername(rs.getString("username"));
        user.setRole(rs.getString("role"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setId(rs.getInt("id"));
        user.setCreated(rs.getString("created"));
 
        return user;
	}
}
