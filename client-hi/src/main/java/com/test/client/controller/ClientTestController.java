package com.test.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.client.feign.ServiceHi;

@RestController
@RequestMapping("/test")
public class ClientTestController {
	
	@Autowired
	ServiceHi serviceHi;

	@GetMapping("/test-hello")
	public String test(String name) {
		//throw new RuntimeException("aaa");
		return serviceHi.sayHiFromClientOne(name);
	}
}
