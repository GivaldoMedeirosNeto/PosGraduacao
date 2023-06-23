package com.ead.posestacio.dao;

import com.ead.posestacio.model.Usuario;

public class UsuarioDAO extends ConexaoDAO{
	private boolean retorno = false;
	private String sql;

	public boolean validarUsuario(Usuario usuario) throws Exception {
		try {
			abrirConexao();
			sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, usuario.getUsuario());
			statement.setString(2, usuario.getSenha());
			resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				usuario.setNivel(resultSet.getInt("nivel"));
				retorno = true;
			}			
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return retorno;
	}
	
}
