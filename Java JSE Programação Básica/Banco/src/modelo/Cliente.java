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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome.contains(" ") ? nome.substring(0, nome.indexOf(' ')) : nome;
	}

	public void setNome(String nome) {
		if(nome.isEmpty()) {
			this.nome = "NÃO INFORMADO";
		} else {
			this.nome = nome;
		}
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

	public static int getQuantidade() {
		return quantidade;
	}

	public static void setQuantidade(int quantidade) {
		Cliente.quantidade = quantidade;
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
