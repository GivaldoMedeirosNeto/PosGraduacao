package modelo;

import java.text.DecimalFormat;

public class Conta {
	
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	
	private static int contator;
	

	public String getSaldoFormatado() {
		return DecimalFormat.getCurrencyInstance().format(saldo);
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
