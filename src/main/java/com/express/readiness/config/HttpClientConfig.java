package com.express.readiness.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpClientConfig {
	
	 @Value("${RUN_WARMUP_TIMES:0}")
	 private int runWarmupTimes;

	@Bean
	public RestTemplate restTemplateWarm(RestTemplateBuilder builder) {
		RestTemplate warm =  builder.build();
		for(int i = 0; i < runWarmupTimes; i++) {
			warm.getForObject("https://jsonplaceholder.typicode.com/posts", List.class);
		}
		return warm;
	}

}
