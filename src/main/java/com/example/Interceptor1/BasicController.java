package com.example.Interceptor1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
	@Autowired
	APILoggingInterceptor apiLoggingInterceptor;
	@GetMapping
	public String basicController() {
		LocalDateTime date = LocalDateTime.now();
		return date.toString();
	}
}
