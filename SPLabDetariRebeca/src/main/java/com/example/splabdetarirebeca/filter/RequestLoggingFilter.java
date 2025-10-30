package com.example.splabdetarirebeca.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import jakarta.servlet.Filter;

public class RequestLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("📥 Request primit: " + request);
        chain.doFilter(request, response);
        System.out.println("📤 Răspuns trimis pentru: " + request);
    }
}
