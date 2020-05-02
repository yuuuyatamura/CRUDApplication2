package com.example.demo.trySpring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

	@Autowired
	private HelloRepository helloRepository;

	public Employee findOne(int id) {
		System.out.println("HelloServiceの中①");

		//1件検索実行
		Map<String,Object> map = helloRepository.findOne(id);

		int employeeId = (Integer)map.get("employee_id");
		String employeeName = (String)map.get("employee_name");
		int age = (Integer)map.get("age");

		System.out.println("HelloServiceの中②");
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setAge(age);

		System.out.println("HelloServiceの中③");
		return employee;
	}
}
