package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@GetMapping("/Hello")
public class GreetingController1 {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public String sessions() {
		return "{\"message\":\"Hello Worldv1\"}";;
	}

	@GetMapping("/greeting")
	public Greeting greeting1(@RequestParam(value = "name", defaultValue = "User") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
