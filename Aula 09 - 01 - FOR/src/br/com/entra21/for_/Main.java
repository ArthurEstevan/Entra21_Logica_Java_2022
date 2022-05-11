package br.com.entra21.for_;

import java.util.Scanner;

public class Main {

	// --------APRENDENDO ESTRUTURA FOR--------//
	public static void main(String[] args) {

		menuFor();

	}

	// --------MENU FOR--------//
	public static void menuFor() {

		Scanner inPut = new Scanner(System.in);
		String opcao;

		System.out.println();
		System.out.println("Sobre o for escolha uma opção para aprender");

		System.out.println("1 - for simple;");
		System.out.println("2 - for inside for;");
		System.out.println("3 - Limit exercise");
		System.out.println("4 - Final exercise");
		System.out.println("5 - Return multiplication table");
		System.out.println("6 - Full multiplication table");
		opcao = inPut.nextLine();

		switch (opcao.toLowerCase()) {

		case "1", "for simple": // simple structure
			classForSimple(); // função do tipo procedimento sem retorno
			break;

		case "2", "for inside for": // complex structure
			classForIniseFor(); // função do tipo procedimento sem retorno
			break;

		case "3": // exercício de contagem crescente
			contagemCrescente(); // função do tipo procedimento sem retorno
			break;

		case "4": // exercício de contagem decrescente
			contagemDecrescente(); // função do tipo procedimento sem retorno
			break;

		case "5": // exercício tabuada do número informado
			tableExercise(); // função do tipo procedimento sem retorno
			break;

		case "6": // exercício tabuada completa
			completTable(); // função do tipo procedimento sem retorno
			break;

		}
	}

	// --------APRENDENDO ESTRUTURA FOR SIMPLE--------//
	public static void classForSimple() {
		System.out.println("Aprendendo sobre For");

		// contador 01
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {

			System.out.println("Repetindo " + contador1);
			System.out.println("-------------");
		}

		// contador 02
		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);
			// System.out.println("Repetindo " +contador1);
			// Esse syso só existe no outro escopo for
		}

		// contador 03
		for (int contador = 4; contador <= 10; contador += 2) {

			System.out.println("OBA " + contador);
		}

		for (int contador = 10; contador > 0; contador -= 1) {

			System.out.println("Resultado " + contador);

		}

		// contador 04
		int tabuada = 3, contador = 1;

		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Tabuada " + contador + " x " + tabuada + " = " + (tabuada * contador));

		}

		System.out.println("Olha como o contador ficou " + contador);
	}

	// --------APRENDENDO ESTRUTURA FOR INSIDE FOR--------//
	public static void classForIniseFor() {

		System.out.println("Aprendendo sobre for da maneira mais complexa");
		System.out.println();

		byte nivelMaior = 3, nivelDetalhe = 3;

		for (int contador = 1; contador <= nivelMaior; contador++) {

			System.out.println("Para o nivel maior repetindo pela " + contador + "° vez\n");

			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				System.out.println("\tPara o nivel menor repetindo pela" + contadorInterno + "° vezes");
			}
		}

	}

	// --------FOR CONTAGEM CRESCESNTE--------//
	public static void contagemCrescente() {

		Scanner inPut = new Scanner(System.in);

		byte limite;

		System.out.println("Até qual número você quer contar?");
		limite = inPut.nextByte();
		System.out.println();

		for (int contador = 1; contador <= limite; contador++) {

			System.out.println("Sua contagem: " + contador);

		}

	}

	// --------FOR CONTAGEM DESCRESCENTE--------//
	public static void contagemDecrescente() {

		Scanner inPut = new Scanner(System.in);

		byte numero;

		System.out.println("Qual número final?");
		numero = inPut.nextByte();
		System.out.println();

		for (int contador = numero; contador > 0; contador--) {

			System.out.println("Sua Contagem " + contador);
		}

	}

	// --------FOR TABUADA--------//
	private static void tableExercise() {

		Scanner inPut = new Scanner(System.in);

		int tabuada;

		System.out.println("Enter the multiplication table number");
		tabuada = inPut.nextInt();

		for (int contador = 1; contador < 11; contador++) { // contador serve pra montar minha lista

			System.out.println("-YOUR MULTIPLICATION TABLE- ");
			System.out.println(+tabuada + " x " + contador + " = " + (tabuada * contador)); // esse parâmetro faz minha
																							// tabuada

		}
	}

	// --------FOR TABUADA COMPLETA--------//
	private static void completTable() {

		Scanner inPut = new Scanner(System.in);

		int completTable;

		System.out.println("-Enter the number for multiplication table-\n");
		completTable = inPut.nextInt(); // determina minha até onde vai a tabuada

		for (int contador = 1; contador <= completTable; contador++) { // for para montar a tabuada
			System.out.println("Multiplication Table " + contador); // write how many multiplication tables the user
																	// determined

			for (int contadorIterno = 1; contadorIterno < 11; contadorIterno++) { // for para o cálculo da tabuada
				System.out.println(contador + " x " + contadorIterno + "= " + (contador * contadorIterno));// Conta
																											// Aritmética
			}

		}
	}
}