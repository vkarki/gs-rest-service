package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {

	@GetMapping("/session")
	public Session session() {
		return new Session("stay relevant stay on top", "Azure DevOps", "Test");
	}

}
