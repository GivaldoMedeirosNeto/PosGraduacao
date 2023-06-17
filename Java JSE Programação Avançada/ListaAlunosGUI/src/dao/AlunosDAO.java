package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunosDAO {
	
	Connection connection;
	PreparedStatement stmt;
	ResultSet resultSet;
	
	String url = "jdbc:mysql://localhost:3306/posjava";
	String root = "root";
	String pass	= "Db4G1v4ld0@85";
	
	private void connectar() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, root, pass);
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void desconnectar() throws Exception{
		if(!connection.isClosed()) {
			connection.close();
		}
	}
	
	public void incluir(Aluno aluno) throws Exception {
		
		String sql = "insert into alunos (RM, nome, curso, periodo) values (?, ?, ?, ?)";
		
		try {
			connectar();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, aluno.getRm());
			stmt.setString(2, aluno.getNome());
			stmt.setString(3, aluno.getCurso());
			stmt.setString(4, aluno.getPeriodo());
			stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			desconnectar();
		}
	}

	public List<Aluno> listarAlunos ()throws Exception {
		List<Aluno> alunos = new ArrayList<Aluno>();
		String sql = "select * from alunos";
		
		try {
			connectar();
			stmt = connection.prepareStatement(sql);
			resultSet = stmt.executeQuery();
			
			while(resultSet.next()) {
				Aluno aluno = new Aluno(
					resultSet.getString("RM"),
					resultSet.getString("nome"),
					resultSet.getString("curso"),
					resultSet.getString("periodo")				
				);				
				alunos.add(aluno);
			}
			
		} catch (Exception e) {
			throw e;
		} finally {
			desconnectar();
		}
		
		return alunos;
	}
	
}
