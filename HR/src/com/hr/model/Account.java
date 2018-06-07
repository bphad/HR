package com.hr.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.hr.beans.Address;
import com.hr.beans.Employee;

@Component
public class Account {

	private NamedParameterJdbcTemplate jdbc;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Employee> getEmployee() {
		return jdbc.query("select * from employee", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new  Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setContact(rs.getString("contact"));
				e.setCity(rs.getString("city"));
				e.setStreet(rs.getString("street"));
				return e;
			}
		});
	}

	public Employee getSingleEmployee(int id) {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("id", id);
		return jdbc.queryForObject("select * from employee where id=:id",map, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new  Employee();
				Address a = new Address();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setContact(rs.getString("contact"));
				a.setCity(rs.getString("city"));
				a.setStreet(rs.getString("street"));
				e.setAddress(a);
				return e;
			}
		});
	}

	public void createEmployee(Employee e) {
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("name", e.getName());
		map.addValue("contact", e.getContact());
		map.addValue("city", e.getAddress().getCity());
		map.addValue("street", e.getAddress().getStreet());
		
		jdbc.update("insert into employee(name,contact,city,street) value(:name,:contact,:city,:street)", map);
	}
}
