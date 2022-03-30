package com.yingdeng.rest.webservices.restfulwebservices.basicauth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AuthenticationController {

	@GetMapping("/basicauth")
	public AuthenticationBean authenticationBean() {
		return new AuthenticationBean("You are authenticated!");
	}
	
}
