package com.cluo.config.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cluo.config.service.TestService;

@RestController
public class TestController {
	
    @Autowired
	TestService testService;
    
	@GetMapping("/test/find")
	public List<Map<String,Object>> findAll(){
		return testService.findAll();
	}
}
