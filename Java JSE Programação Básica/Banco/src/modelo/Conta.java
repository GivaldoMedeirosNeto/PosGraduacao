package modelo;

import java.text.DecimalFormat;

public class Conta {
	
	protected int numero;
	protected Cliente cliente;
	protected double saldo;
	
	private static int contator;	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getContator() {
		return contator;
	}

	public static void setContator(int contator) {
		Conta.contator = contator;
	}

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
