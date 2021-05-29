package com.ibm.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Hey!!! Let's learn JWT";
	}
}
