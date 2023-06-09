package programas;

import javax.swing.JOptionPane;

public class TesteExcecoes {

	public static void main(String[] args) {
		
		String idade = JOptionPane.showInputDialog(null, "Qual a sua idade");
		int valorIdade = Integer.parseInt(idade);
		System.out.println("Sua idade é " + valorIdade);

	}

}
