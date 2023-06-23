package com.ead.posestacio.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Calculadora")
public class ServletCalculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletCalculadora() { }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
			
			try {
				double op1 = Double.parseDouble(request.getParameter("op1"));				
				String op = request.getParameter("op");
				double op2 = Double.parseDouble(request.getParameter("op2"));
				double resultado = 0;
				
				switch (op) {
					case "1": resultado = op1 + op2; break;
					case "2": resultado = op1 - op2; break;
					case "3": resultado = op1 * op2; break;
					case "4": resultado = op1 / op2; break;
					default: resultado = op1 + op2;
				}
				
				out.println("Resultado: " + resultado);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
