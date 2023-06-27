package com.ead.posestacio.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class ListinerSessao implements HttpSessionListener, HttpSessionAttributeListener {


    public ListinerSessao() { }

    public void attributeReplaced(HttpSessionBindingEvent se)  {
    	System.out.println("Atributo Subistituido");
    }

    public void sessionCreated(HttpSessionEvent se)  {
    	System.out.println("Sessão Criada");
    }

    public void sessionDestroyed(HttpSessionEvent se)  {
    	System.out.println("Sessão Removida");
    }

    public void attributeRemoved(HttpSessionBindingEvent se)  {
    	System.out.println("Atributo removido");
    }

    public void attributeAdded(HttpSessionBindingEvent se)  {
    	System.out.println("Atributo Adicionado a Sessão");
    }
	
}
