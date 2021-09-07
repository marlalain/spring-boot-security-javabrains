package com.pauloelienay.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/user/hello")
	public String userHello() {
		return "Hello User";
	}

	@GetMapping("/admin/hello")
	public String adminHello() {
		return "Hello Admin";
	}
}
