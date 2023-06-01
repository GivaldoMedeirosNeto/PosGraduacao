package tela;

import javax.swing.JOptionPane;

import modelo.Cliente;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente("Anita", "Marília", "São Paulo");
		Cliente cliente2 = new Cliente("Marcos", "Garça", "São Paulo");
		
		
		JOptionPane.showMessageDialog(null, cliente1.listarDados());
		JOptionPane.showMessageDialog(null, cliente2.listarDados());
		
		JOptionPane.showMessageDialog(null,
			"Possuimos " + Cliente.qtdClientes() + " cliente(s) cadastrados");
		
	}

}
