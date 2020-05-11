package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSecurityController {
	
	@GetMapping("/")
	public String getHelloMessage() {
		return "All welcome to first spring security app";
	}
	
	@GetMapping("/user")
	public String getUserHelloMessage() {
		return "User welcome to first spring security app";
	}
	
	@GetMapping("/admin")
	public String geAdmintHelloMessage() {
		return "Admin welcome to first spring security app";
	}
	
	

}
