package com.example.Interceptor1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
	
	@Autowired
	APILoggingInterceptor apiLoggingInterceptor;
	@Autowired
	LegacyInterceptor legacyInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(apiLoggingInterceptor);
		registry.addInterceptor(legacyInterceptor);
	}
}