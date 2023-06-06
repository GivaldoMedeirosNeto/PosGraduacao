package tela;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		String tipoCliente = JOptionPane.showInputDialog(null,
			"Escolha o tipo de cliente:\n" + "PF - Pessoa Física\n" + "PJ - Pessoa Jurídica");
		
		if(tipoCliente.equals("PF")) {
			cliente = new PessoaFisica();
			((PessoaFisica)cliente).setNome(JOptionPane.showInputDialog(null, "Informe o Nome:"));
			((PessoaFisica)cliente).setCpf(JOptionPane.showInputDialog(null, "Informe o CPF:"));
		} else if (tipoCliente.equals("PJ")) {
			cliente = new PessoaJuridica();
			((PessoaJuridica)cliente).setRazaoSocial(JOptionPane.showInputDialog(null, "Informe a Razão Social:"));
			((PessoaJuridica)cliente).setCnpj(JOptionPane.showInputDialog(null, "Informe o CNPJ:"));
		} else {
			JOptionPane.showMessageDialog(null, "Opção Inválida! Encerrando o programa");
		}
		
		cliente.setCidade(JOptionPane.showInputDialog(null, "Informe a Cidade:"));
		cliente.setEstado(JOptionPane.showInputDialog(null, "Informe o Estado:"));
		
		JOptionPane.showInputDialog(null, "DADOS DO CLIENTE\n\n" + cliente.listarDados());
		
		Conta conta;
		String tipoConta = JOptionPane.showInputDialog(null,
				"Tipo de conta a ser criada:\n" + "CC - Conta Corrente\nCP - Conta Poupança");
		
		if (tipoConta.equals("CP")) {
			conta = new ContaPoupanca(cliente);
		} else {
			conta = new ContaCorrente(cliente);
		}
		
		JOptionPane.showInputDialog(null, "DADOS DA CONTA\n\n" + conta.listarDados());
		
		int opcao= 0;
		String ret;
		
		do {
			
			String mensagem = "SALDO EM CONTA: " + conta.getSaldoFormatado() + "\n\n" +
				"OPÇÕES: \n1 - Depositar valor\n2 - Sacar valor\n3 - Finalizar";
					try {
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do depósito:"));
							switch (opcao) {
								case 1:
									ret = JOptionPane.showInputDialog(null, "Valor do depósito:");
									conta.depositar(Double.parseDouble(ret));
									JOptionPane.showMessageDialog(null, "Depósito realizado!");
									break;
								case 2:
									ret = JOptionPane.showInputDialog(null, "Valor do saque:");
										if (conta.sacar(Double.parseDouble(ret))) {
											JOptionPane.showMessageDialog(null, "Saque realizado!");
										} else {
											JOptionPane.showMessageDialog(null, "FALHA NO SAQUE!");
										}
							}
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!");
					}			
		} while ((opcao == 1) || (opcao == 2));
		
	}

}
