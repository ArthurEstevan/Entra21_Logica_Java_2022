package br.com.Entra21.OperadoresDeIgualdade;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores de Igualdade");
		System.out.println();
		
		byte idadeA=5, idadeB=10;
		boolean resultado; 
		
		resultado = idadeA == idadeB; 
		
		System.out.println("Ao comparar a igualdade resultou em "+resultado);
		
		resultado = idadeA != idadeB;
		
		System.out.println("Ao comparar a desigualdade resultou em "+resultado);
		

	}

}
