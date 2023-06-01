package tela;

import javax.swing.JOptionPane;

import modelo.Cliente;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Anita");
		cliente.setCidade("Marília");
		cliente.setEstado("São Paulo");
		
		JOptionPane.showMessageDialog(null, cliente.listarDados());
		
	}

}
