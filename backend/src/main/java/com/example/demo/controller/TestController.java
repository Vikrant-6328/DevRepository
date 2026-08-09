package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
   
	@GetMapping("/testMethod")
	public String testMethod() {
		return "Testing Method Executes";
	}

	//i will make a second method to test the scenario
	@GetMapping("/checkMethod")
	public String checkMethod(){
		return "Method checked Successfully";
	}

}
