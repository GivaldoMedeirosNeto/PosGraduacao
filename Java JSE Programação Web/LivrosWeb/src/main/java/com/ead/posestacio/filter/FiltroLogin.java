package com.ead.posestacio.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/admin/*")
public class FiltroLogin extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

    public FiltroLogin() { }

	public void destroy() { }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
		if(session.getAttribute("user") == null) {
			((HttpServletResponse)response).sendRedirect("/LivrosWeb/loing.jsp");
		} else {
			chain.doFilter(request, response);			
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException { }

}
