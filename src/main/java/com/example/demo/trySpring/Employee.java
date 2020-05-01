package com.example.demo.trySpring;

import lombok.Data;

//getterとかsetterとか自動生成してくれる
@Data
public class Employee {

	private int employeeId; //従業員ID
 	private String employeeName; //従業員名
	private int age; //年齢
}