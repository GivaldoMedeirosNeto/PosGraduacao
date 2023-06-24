package com.ead.posestacio.model;

public class Livro {
	
	private int cod;
	private String titulo;
	private String autor;
	private String datapub;
	private double preco;
	
	public int getCod() {
		return cod;
	}
	
	public void setCod(int cod) {
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
	
	public String getDatapub() {
		return datapub;
	}
	
	public void setDatapub(String datapub) {
		this.datapub = datapub;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}	

}
