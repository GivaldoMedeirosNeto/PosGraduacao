package modelo;

public class Cliente {
	
	private String nome;
	private String cidade;
	private String estado;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

	public String listarDados() {
		return "NOME: " + nome + "\n" + "CIDADE: " + cidade + "\n" + "ESTADO: " + estado;
	}
	
	

}
