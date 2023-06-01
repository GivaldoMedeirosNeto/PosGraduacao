package modelo;

public class Cliente {
	
	private int codigo;
	private String nome;
	private String cidade;
	private String estado;
	
	private static int quantidade;
	
	public Cliente() {
		quantidade++;
		codigo = quantidade;
		nome = "INDEFINIDO";
		cidade = "São Paulo";
		estado = "São Paulo";
	}
	
	public Cliente(String nome, String cidade, String estado) {
		quantidade++;
		codigo = quantidade;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String listarDados() {
		return  "CÓDIGO: " + codigo + "\n" +
				"NOME: " + nome + "\n" +
				"CIDADE: " + cidade + "\n" +
				"ESTADO: " + estado;
	}
	
	public static int qtdClientes() {
		return quantidade;
	}

}
