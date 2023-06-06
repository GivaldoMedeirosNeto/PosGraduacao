package tela;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Conta;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		JOptionPane.showMessageDialog(null,
			"Possuimos " + Cliente.qtdClientes() + " cliente(s) cadastrados");
		
		int opcao = 0;
		String ret;
		do {
			
			String msg = "Saldo em Conta: " + conta.getSaldoFormatado() + "\n\n" + 
				"OPÇÕES: \n1 - Depositar:\n2 - Sacar\n3 - Finalizar";
			
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, msg));
				switch(opcao) {
					case 1:
						ret = JOptionPane.showInputDialog(null, "Valor do Deposito:");
						conta.depositar(Double.parseDouble(ret));
						JOptionPane.showMessageDialog(null, "Deposito realizado");
						break;
					case 2:
						ret = JOptionPane.showInputDialog(null, "Valor do Saque:");
						if(conta.sacar(Double.parseDouble(ret))) {
							JOptionPane.showMessageDialog(null, "Saque realizado");
						} else {
							JOptionPane.showMessageDialog(null, "Saque não realizado");
						}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
			
		} while ((opcao ==1) || opcao == 2);
		
	}

}
