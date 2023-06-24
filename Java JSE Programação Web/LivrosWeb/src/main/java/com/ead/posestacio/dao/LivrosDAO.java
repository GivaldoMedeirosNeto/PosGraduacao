package com.ead.posestacio.dao;

import java.util.ArrayList;
import java.util.List;

import com.ead.posestacio.model.Livro;
import com.ead.posestacio.model.DataHora;

public class LivrosDAO extends ConexaoDAO{

	private String sql;
	private String msg;
	
	public String cadastrar(Livro livro) throws Exception {
		try {
			abrirConexao();
			sql = "INSERT INTO livros (titulo, autor, datapub, preco) VALUES (?, ?, ? , ?);";
			statement = connection.prepareStatement(sql);
			statement.setString(1, livro.getTitulo());
			statement.setString(2, livro.getAutor());
			statement.setString(3, new DataHora().dataAtual());
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

	public List<Livro> listarLivros()throws Exception {
		List<Livro> livros = new ArrayList<Livro>();
		try {
			abrirConexao();
			sql = "";
			
			statement = connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			
			while(resultSet.next()) {
				Livro livro = new Livro();
				livro.setCod(resultSet.getInt("cod"));
				livro.setTitulo(resultSet.getString("titulo"));
				livro.setAutor(resultSet.getString("autor"));
				livro.setDatapub(resultSet.getString("datapub"));
				livro.setPreco(resultSet.getDouble("preco"));
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return livros;
	}
}
