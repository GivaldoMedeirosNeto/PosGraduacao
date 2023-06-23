package com.ead.posestacio.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoDAO {
	
	private String url = "jdbc:mysql://localhost:3306/servletjsp";
	protected Connection connection;
	protected PreparedStatement statement;
	protected ResultSet resultSet;
	
	protected boolean abrirConexao() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "root", "Db4G1v4ld0@85");
			return true;
		} catch (Exception e) {
			throw e;
		}
	}
	
	protected void fecharConexao() throws Exception {
		connection.close();
	}

}
