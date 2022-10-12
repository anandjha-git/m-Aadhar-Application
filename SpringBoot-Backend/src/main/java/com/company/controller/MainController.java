package com.company.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/")
	public String message() {
		return "m-Aadhar Application Backend";
	}

}
