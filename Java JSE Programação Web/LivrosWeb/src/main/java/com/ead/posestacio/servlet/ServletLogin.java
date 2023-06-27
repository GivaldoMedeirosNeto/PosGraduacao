package com.ead.posestacio.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.ead.posestacio.dao.UsuarioDAO;
import com.ead.posestacio.model.Usuario;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UsuarioDAO dao = new UsuarioDAO();
	private Usuario modelUsuario;

    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		response.sendRedirect("login.jsp");	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
				
		Usuario usuario = new Usuario();
		UsuarioDAO dao = new UsuarioDAO();
		
		try {
			usuario.setUsuario(request.getParameter("usuario"));
			usuario.setSenha(request.getParameter("senha"));
			
			if(dao.validarUsuario(usuario)) {
				HttpSession session = request.getSession();
				session.setAttribute("user", usuario);
				response.sendRedirect("paginas/menu.jsp");
			} else {
				out.println("Usuário ou Senha inválidos");
				out.println("<a href='login.jsp'>Voltar para Login</a>");
				
			}
			
			
		} catch (Exception e) {
			out.println(e.getMessage());
		}
		
	}

}
