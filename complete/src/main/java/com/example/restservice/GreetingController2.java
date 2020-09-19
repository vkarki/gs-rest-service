package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController2 {

	@GetMapping("/greeting2")
	public String greeting2() {
		return "{\r\n   \"program\":\"stay relevant stay on top\",\r\n   \"topic\":\"Azure DevOps\",\r\n   \"presenter\":\"Vishal Karki\",\r\n   \"Agenda\":{\r\n      \"Section1\":\"DevOps philosophy\",\r\n      \"Section2\":\"Tool walkaround\",\r\n      \"Section3\":\"Deploy a Restful app service\"\r\n   }\r\n}";;
	}

}