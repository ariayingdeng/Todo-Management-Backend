package com.yingdeng.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWord() {
		return "Hello World";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWordBean() {
		return new HelloWorldBean("Hello World Bean!");
	}
	
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWordPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello, %s!", name));
//		throw new RuntimeException("Something went wrong...");
	}
}
