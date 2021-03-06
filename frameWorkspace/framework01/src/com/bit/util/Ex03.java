package com.bit.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex03 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Ex03 Filter...init");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Ex03 Filter...doFilter");
		// chain의 doFilter는 다음 filter를 호출한다.
		System.out.println("before filter Ex03");
		chain.doFilter(request, response);
		System.out.println("after filter Ex03");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}
