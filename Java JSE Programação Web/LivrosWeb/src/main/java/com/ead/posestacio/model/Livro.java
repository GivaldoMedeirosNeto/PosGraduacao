package com.ead.posestacio.model;

import java.util.Date;

public class Livro {
	
	private String cod;
	private String titulo;
	private String autor;
	private Date datapub;
	private double preco;
	
	public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Date getDatapub() {
		return datapub;
	}
	
	public void setDatapub(Date datapub) {
		this.datapub = datapub;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}	

}
