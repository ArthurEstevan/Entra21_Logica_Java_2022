package br.com.Entra21.OperadorRelacional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exercício de Operador Relacional");
		
		System.out.println("Faça um programa que informe se o 1º numero é maior que o 2º numero");
		System.out.println("Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero.");
		System.out.println("Faça um programa que informe se o 1º numero é menor que o 2º numero");
		System.out.println("Faça um programa que informe se o 1º numero é menor ou igual que o 2º numero");

		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA = 10;
		numeroB = 20;
		
		System.out.println("O númeroA é mairo que o númeroB? " + (numeroA > numeroB) );
		System.out.println();
		System.out.println("O númeroA é mairo que o númeroB? " + (numeroA >= numeroB) );
		System.out.println();
		System.out.println("O númeroA é mairo que o númeroB? " + (numeroA < numeroB) );
		System.out.println();
		System.out.println("O númeroA é mairo que o númeroB? " + (numeroA <= numeroB) );
	}

}
