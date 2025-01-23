package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	
	@GetMapping("/hello")
	public String hello() {
		long time = System.currentTimeMillis();
		return "Hello"+ time;
	}
	
	
}
