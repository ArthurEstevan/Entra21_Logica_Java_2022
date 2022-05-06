package br.com.Entra21.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Crie um programa que faça vários cálculos");
		System.out.println();
		System.out.println("- Informe qual operação matemática deseja realizar");
		System.out.println("- caso informe 0 deve encerrar o programa");
		System.out.println("1 = somar\r\n" + "2 = subtrair\r\n" + "3 = multiplicar\r\n" + "4 = dividir");
		System.out.println("Capturar os 2 valores e informar o resultado, esperar o próximo calculo.");
		System.out.println();

		Scanner inPut = new Scanner(System.in);

		String opcao;

		System.out.println("----------------------------------------------------");
		System.out.println("-                   Informe Ação                   -");
		System.out.println("----------------------------------------------------");

		System.out.println("1 - adição");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		opcao = inPut.next();
		System.out.println();

		switch (opcao.toLowerCase()) {

		case "1":
		case "adição":
			float soma = soma(0, 0);
			System.out.println("seu resultado é: " + soma);
			menu();
			break;

		case "2":
		case "subtração":
			float menos = menos(0, 0);
			System.out.println("seu resultado é: " + menos);
			menu();
			break;

		case "3":
		case "multicplicação":
			float vezes = vezes(0, 0);
			System.out.println("seu resultado é: " + vezes);
			menu();
			break;

		case "4":
		case "divisão":
			float divisao = div(0, 0);
			System.out.println("seu resultado é: " + divisao);
			menu();
			break;

		}

	}

	public static float soma(float numeroA, float numeroB) {
		Scanner inPut = new Scanner(System.in);
		System.out.println("NumeroA: ");
		numeroA = inPut.nextFloat();
		System.out.println();
		System.out.println("NumeroB: ");
		numeroB = inPut.nextFloat();
		System.out.println();

		if ((numeroA == 0) && (numeroB == 0)) {
			System.out.println("ERROR");
			System.exit(1);
		}
		return numeroA + numeroB;
	}

	public static float menos(float numeroA, float numeroB) {
		Scanner inPut = new Scanner(System.in);
		System.out.println("NumeroA: ");
		numeroA = inPut.nextFloat();
		System.out.println();
		System.out.println("NumeroB: ");
		numeroB = inPut.nextFloat();
		System.out.println();

		if ((numeroA == 0) && (numeroB == 0)) {
			System.out.println("ERROR");
			System.exit(1);
		}
		return numeroA - numeroB;
	}

	public static float vezes(float numeroA, float numeroB) {
		Scanner inPut = new Scanner(System.in);
		System.out.println("NumeroA: ");
		numeroA = inPut.nextFloat();
		System.out.println();
		System.out.println("NumeroB: ");
		numeroB = inPut.nextFloat();
		System.out.println();

		if ((numeroA == 0) && (numeroB == 0)) {
			System.out.println("ERROR");
			System.exit(1);
		}
		return numeroA * numeroB;
	}

	public static float div(float numeroA, float numeroB) {
		Scanner inPut = new Scanner(System.in);
		System.out.println("NumeroA: ");
		numeroA = inPut.nextFloat();
		System.out.println();
		System.out.println("NumeroB: ");
		numeroB = inPut.nextFloat();
		System.out.println();

		if ((numeroA == 0) && (numeroB == 0)) {
			System.out.println("ERROR");
			System.exit(1);
		}
		return numeroA / numeroB;
	}

	public static void menu() {
		Scanner inPut = new Scanner(System.in);
		String opcao;

		System.out.println("----------------------------------------------------");
		System.out.println("-                   Informe Ação                   -");
		System.out.println("----------------------------------------------------");

		System.out.println("1 - adição");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		opcao = inPut.next();
		System.out.println();

		switch (opcao.toLowerCase()) {

		case "1":
		case "adição":
			float soma = soma(0, 0);
			System.out.println("seu resultado é: " + soma);
			break;

		case "2":
		case "subtração":
			float menos = menos(0, 0);
			System.out.println("seu resultado é: " + menos);
			break;

		case "3":
		case "multicplicação":
			float vezes = vezes(0, 0);
			System.out.println("seu resultado é: " + vezes);
			break;

		case "4":
		case "divisão":
			float divisao = div(0, 0);
			System.out.println("seu resultado é: " + divisao);
			break;

		}
	
	}
}
