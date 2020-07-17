package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestContoller {

	@GetMapping("/test")
	public String test() {
		//throw new RuntimeException("aaa");
		return "test";
	}
}
