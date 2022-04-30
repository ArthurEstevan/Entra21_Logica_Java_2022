package br.com.Entra21.OperadoresAritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("OperadoresAritméticos");
		System.out.println();
	
		
		float numeroA, numeroB, calculoSoma, resto;

		Scanner inPut = new Scanner(System.in);

		System.out.println("Informe o valor do número A:");
		numeroA = inPut.nextFloat();

		System.out.println("Informe o valor do número B:");
		numeroB = inPut.nextFloat();
		
	
		calculoSoma = numeroA + numeroB;
		
		System.out.println();
		System.out.println("A soma entre os números: " + (calculoSoma));

		System.out.println("A subtração entre os números: " + (numeroA - numeroB) );

		System.out.println("A multiplicação entre os número: " + (numeroA * numeroB) );

		System.out.println("Essa é a divisão entre os número: " + (numeroA / numeroB) );


		resto = numeroA % numeroB;
		
		System.out.println("O resto da divisão " + (numeroA % numeroB) );

		boolean eDivissivel = numeroA % numeroB == 0;
		
		System.out.println();
		System.out.println("É divissivel entre si? " + eDivissivel);
	}

}
