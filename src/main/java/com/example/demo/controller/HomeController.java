package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	public HomeController() {
		
	}
	
	@RequestMapping(value = "/")
    public String homePage() {
	
	return "Hello Spring boot - Git Demo";
		
	}

}
