package com.ead.posestacio.dao;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.ead.posestacio.model.Livro;

public class LivrosDAO extends ConexaoDAO{

	private String sql;
	private String msg;
	
	public String cadastrar(Livro livro) throws Exception{
		try {
			abrirConexao();
			sql = "INSERT INTO livros (titulo, autor, datapub, preco) VALUES (?, ?, ? , ?);";
			statement = connection.prepareStatement(sql);
			statement.setString(1, livro.getTitulo());
			statement.setString(2, livro.getAutor());
			statement.setDate(3, (Date) livro.getDatapub());
			statement.setDouble(4, livro.getPreco());
			
			int contador = statement.executeUpdate();
			
			if(contador == 0) {
				msg = "Nenhum livro foi inserido!";
			} else {
				msg = "Livro foi inserido com Sucesso!";
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}	
		
		return msg;
	}
}
