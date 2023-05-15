package com.example.Interceptor1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LegacyInterceptor implements HandlerInterceptor {
	public static final String LEGACY_ENDPOINT = "/legacy";
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (request.getRequestURI().startsWith(LEGACY_ENDPOINT)){
			response.setStatus(HttpStatus.GONE.value());
			return false;
		}
		return true;
	}
}
