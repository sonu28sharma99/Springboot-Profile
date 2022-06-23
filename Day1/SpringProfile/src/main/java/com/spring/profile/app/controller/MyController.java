package com.spring.profile.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Value("${my.home.name}")
	private String myHomeName;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome " + myHomeName;
	}

}
