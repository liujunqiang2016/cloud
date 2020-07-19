package com.test.hi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@RequestMapping("/test")
	public Map<String,String> test(@RequestParam("name") String name){
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", "zhang");
		return map;
	}
}
