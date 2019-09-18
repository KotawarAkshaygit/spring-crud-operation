package com.isteer.springinsertdbs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component("empdao")
public class EmployeeDaoImpl implements EmployeeDaoI {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	final String INSERT_QUERY = "insert into springdbinsert(name, location,contact) values (?, ?, ?)";
	final String UPDATE_QUERY = "update springdbinsert set location = ? ,contact=? where name = ?";
	final String DELETE_QUERY = "delete from springdbinsert where id = ?";

	
	public Number save(final EntityBean employee) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		
			jdbcTemplate.update(
					new PreparedStatementCreator() {
			    	        public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			    	            PreparedStatement pst =
			    	                con.prepareStatement(INSERT_QUERY, new String[] {"id"});
			    	            pst.setString(1, employee.getName());
			    	            pst.setString(2, employee.getLocation());
			    	            pst.setString(3, employee.getContact());
			    	            
			    	            return pst;
			    	        }

							
			    	    },
			    	    keyHolder);
		return	keyHolder.getKey();
			    	
					
					
					
					
					
					//INSERT_QUERY, employee.getName(), employee.getLocation(), employee.getContact(),Statement.RETURN_GENERATED_KEYS);
			 
	}

	public void update(EntityBean employee) {
		int status=jdbcTemplate.update(UPDATE_QUERY,employee.getLocation(),employee.getContact(),employee.getName());
				if(status!=0){
					System.out.println("Employee details updated successfully "+status);
				}
				else
				{
					System.out.println("Not updated of "+employee.getName());
				}

	}

	public void deleteEmpById(int id) {
		int status=jdbcTemplate.update(DELETE_QUERY,id);
		 if(status != 0){
	            System.out.println("Employee data deleted for ID " + id);
	        }else{
	            System.out.println("Employee Data Not Deleted for id"+id);
	        }

	}

}
