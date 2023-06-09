package programas;

public class TesteExcecoes02 {
	
	public static double calcularArea(double base, double altura) {
		/*
		 * consideramos que não seja possível retangulos
		 * com lados negativos
		 */
		
		if(base <=0 || altura <=0) {
			throw new ArithmeticException("Os lados do retângulo devem ser possitivos!");
		}
		
		return base * altura;		
	}
	
	public static void main(String[] args) {
		System.out.println("Área = " + calcularArea(-10, 5));
	}

}
