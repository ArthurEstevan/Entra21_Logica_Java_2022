package br.com.Entra21.OperadoresAritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("OperadoresAritm�ticos");
		System.out.println();
	
		
		float numeroA, numeroB, calculoSoma, resto;

		Scanner inPut = new Scanner(System.in);

		System.out.println("Informe o valor do n�mero A:");
		numeroA = inPut.nextFloat();

		System.out.println("Informe o valor do n�mero B:");
		numeroB = inPut.nextFloat();
		
	
		calculoSoma = numeroA + numeroB;
		
		System.out.println();
		System.out.println("A soma entre os n�meros: " + (calculoSoma));

		System.out.println("A subtra��o entre os n�meros: " + (numeroA - numeroB) );

		System.out.println("A multiplica��o entre os n�mero: " + (numeroA * numeroB) );

		System.out.println("Essa � a divis�o entre os n�mero: " + (numeroA / numeroB) );


		resto = numeroA % numeroB;
		
		System.out.println("O resto da divis�o " + (numeroA % numeroB) );

		boolean eDivissivel = numeroA % numeroB == 0;
		
		System.out.println();
		System.out.println("� divissivel entre si? " + eDivissivel);
	}

}
