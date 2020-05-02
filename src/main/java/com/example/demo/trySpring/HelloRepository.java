package com.example.demo.trySpring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

//@Repository
@Repository
public class HelloRepository {

//JDBCTemplete
	@Autowired
	private JdbcTemplate jdbcTemplete;

	public Map<String,Object> findOne(int id){

	//SELECT文
		String query = "SELECT "
				+ "employee_id,"
				+ "employee_name,"
				+ "age,"
				+ "FROM employee "
				+ "WHERE employee_id=?";

		//検索実行
		Map<String,Object> employee = jdbcTemplete.queryForMap(query,id);
		return employee;
	}
}
