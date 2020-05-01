package com.example.demo.trySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Controller
@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

//@GetMapping
@GetMapping("/hello")
public String getHello() {
	return "hello";
}

//@PostMapping
@PostMapping("/hello")
public String postRequest(@RequestParam("text1")String str, Model model) {

model.addAttribute("sample",str);

return "helloResponse";
}

	@PostMapping("/hello/db")
	public String postDbRequest(@RequestParam("text2") String str, Model model) {

		//int
		int id = Integer.parseInt(str);
		Employee employee = helloService.findOne(id);

		//検索結果をModelに登録
		model.addAttribute("id", employee.getEmployeeId());
		model.addAttribute("name", employee.getEmployeeName());
		model.addAttribute("age", employee.getAge());

		return "helloresponseDB";
	}

}
