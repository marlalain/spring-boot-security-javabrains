package com.pauloelienay.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/admin/hello")
	public String adminHello() {
		return "Hello Admin";
	}
}
