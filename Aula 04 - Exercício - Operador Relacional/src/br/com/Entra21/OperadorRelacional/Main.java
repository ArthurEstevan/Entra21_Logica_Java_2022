package br.com.Entra21.OperadorRelacional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exerc�cio de Operador Relacional");
		
		System.out.println("Fa�a um programa que informe se o 1� numero � maior que o 2� numero");
		System.out.println("Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero.");
		System.out.println("Fa�a um programa que informe se o 1� numero � menor que o 2� numero");
		System.out.println("Fa�a um programa que informe se o 1� numero � menor ou igual que o 2� numero");

		byte numeroA, numeroB;
		boolean resultado;
		
		numeroA = 10;
		numeroB = 20;
		
		System.out.println("O n�meroA � mairo que o n�meroB? " + (numeroA > numeroB) );
		System.out.println();
		System.out.println("O n�meroA � mairo que o n�meroB? " + (numeroA >= numeroB) );
		System.out.println();
		System.out.println("O n�meroA � mairo que o n�meroB? " + (numeroA < numeroB) );
		System.out.println();
		System.out.println("O n�meroA � mairo que o n�meroB? " + (numeroA <= numeroB) );
	}

}
