package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class MyController {

	@GetMapping("/msg")
	public String getMsg() {
		return "Hello!";
	}
}
