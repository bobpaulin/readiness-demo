package com.express.readiness.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ReadyController {
	
	private final RestTemplate restTemplateWarm;
	
	public ReadyController(RestTemplate restTemplateWarm) {
		this.restTemplateWarm = restTemplateWarm;
	}
	
	@GetMapping("/ready/warm")
	public List readyWarm() {
		return restTemplateWarm.getForObject("https://jsonplaceholder.typicode.com/posts", List.class);
	}
}
