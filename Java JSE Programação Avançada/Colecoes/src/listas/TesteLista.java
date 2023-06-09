package listas;

import java.util.ArrayList;

public class TesteLista {
	
	public static void main(String[] args) {
		ArrayList nomes = new ArrayList();
		nomes.add("Givaldo");
		nomes.add("Penelope");
		nomes.add("Kira");
		
		nomes.add(37);
		nomes.add(3);
		nomes.add(6);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		
	}

}
