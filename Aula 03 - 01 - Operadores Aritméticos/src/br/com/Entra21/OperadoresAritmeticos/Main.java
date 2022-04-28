package br.com.Entra21.OperadoresAritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("OperadoresAritméticos");

		System.out.println("Realizando uma soma " + (1 + 3));

		System.out.println(4 + 10);

		float numeroA, numeroB;

		float calculoSoma;

		float resto;

		// Objeto da classe Scanner precisa utilizar o System.in para ter acesso ao
		// teclado
		Scanner inPut = new Scanner(System.in);
		// new Scanner significa construa um objeto da classe Scanner e atribua na
		// variavel entrada

		System.out.println("Informe o valor do número A");
		numeroA = inPut.nextFloat();

		System.out.println("Informe o valor do número B");
		numeroB = inPut.nextFloat();

		System.out.println("A soma entre esses dois números é " + (numeroA + numeroB));
		calculoSoma = numeroA + numeroB;

		System.out.println("Outra forma de fazer a soma é " + (calculoSoma));

		System.out.println("A subtração entre esses dois números é " + (numeroA - numeroB));

		System.out.println("Essa é a multiplicação entre os número A*B " + (numeroA * numeroB));

		System.out.println("Essa é a divisão entre os número A/B " + (numeroA / numeroB));

		resto = numeroA % numeroB;

		System.out.println("O resto da divisão " + (numeroA % numeroB));

		boolean eDivissivel = numeroA % numeroB == 0;

		System.out.println("É divissivel entre si? " + eDivissivel);
	}

}
