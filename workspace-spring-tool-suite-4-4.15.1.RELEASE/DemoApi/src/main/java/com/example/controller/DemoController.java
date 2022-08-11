package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class DemoController {

	@GetMapping("/getdata")
	public String getData() {
		return "Feign demo";
	}
	@GetMapping("/getaddress")
	public String getAddress() {
		return "Icrisat Hyderabad";
	}
}

