package br.com.Entra21.OperadorIgualdade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exercício de Operador de Igualdade");
		System.out.println();
		
		System.out.println("Faça um programa que compare 2 números e informe se o 1º é igual ao 2º numero.");
		System.out.println("Faça um programa que compare 2 números e informe se o 1º é diferente do 2º numero.");
		
		System.out.println();
		
		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA = 10;
		numeroB = 20;
		
		System.out.println("O númeroA é igual ao númeroB? " + (numeroA == numeroB) );
		
		System.out.println();
		
		System.out.println("O númeroA é diferente do númeroB? " + (numeroA != numeroB) );

	}

}
