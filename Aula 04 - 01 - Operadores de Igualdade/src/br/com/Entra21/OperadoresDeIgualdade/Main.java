package br.com.Entra21.OperadoresDeIgualdade;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores de Igualdade");
		
		byte idadeA, idadeB;
		boolean resultado; 
		
		idadeA=5;
		idadeB=10;
		
		resultado = idadeA == idadeB; // == DIZ QUE OS VALORES SÃO IGUAIS
		
		System.out.println("Ao comparar a igualdade resultou em "+resultado);
		
		resultado = idadeA != idadeB; // != COMPARA OS VALORES ENTRE SI
		
		System.out.println("Ao comparar a desigualdade resultou em "+resultado);
		

	}

}
