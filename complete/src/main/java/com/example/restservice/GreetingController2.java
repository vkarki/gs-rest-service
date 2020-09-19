package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController2 {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    Sessions sess = new Sessions();


	@GetMapping("/greeting2")
	public String greeting2() {
		return sess.GetSession();
	}

}