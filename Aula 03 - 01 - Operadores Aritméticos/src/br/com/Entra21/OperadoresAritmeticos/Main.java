package br.com.Entra21.OperadoresAritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("OperadoresAritm�ticos");

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

		System.out.println("Informe o valor do n�mero A");
		numeroA = inPut.nextFloat();

		System.out.println("Informe o valor do n�mero B");
		numeroB = inPut.nextFloat();

		System.out.println("A soma entre esses dois n�meros � " + (numeroA + numeroB));
		calculoSoma = numeroA + numeroB;

		System.out.println("Outra forma de fazer a soma � " + (calculoSoma));

		System.out.println("A subtra��o entre esses dois n�meros � " + (numeroA - numeroB));

		System.out.println("Essa � a multiplica��o entre os n�mero A*B " + (numeroA * numeroB));

		System.out.println("Essa � a divis�o entre os n�mero A/B " + (numeroA / numeroB));

		resto = numeroA % numeroB;

		System.out.println("O resto da divis�o " + (numeroA % numeroB));

		boolean eDivissivel = numeroA % numeroB == 0;

		System.out.println("� divissivel entre si? " + eDivissivel);
	}

}
