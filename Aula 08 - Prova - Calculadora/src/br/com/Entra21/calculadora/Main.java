package br.com.Entra21.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Crie um programa que fa�a v�rios c�lculos");
		System.out.println();
		System.out.println("- Informe qual opera��o matem�tica deseja realizar");
		System.out.println("- caso informe 0 deve encerrar o programa");
		System.out.println("1 = somar\r\n" + "2 = subtrair\r\n" + "3 = multiplicar\r\n" + "4 = dividir");
		System.out.println("Capturar os 2 valores e informar o resultado, esperar o pr�ximo calculo.");
		System.out.println();

		Scanner inPut = new Scanner(System.in);

		String opcao;

		System.out.println("----------------------------------------------------");
		System.out.println("-                   Informe A��o                   -");
		System.out.println("----------------------------------------------------");

		System.out.println("1 - adi��o");
		System.out.println("2 - subtra��o");
		System.out.println("3 - multiplica��o");
		System.out.println("4 - divis�o");
		opcao = inPut.next();
		System.out.println();

		switch (opcao.toLowerCase()) {

		case "1":
		case "adi��o":
			float soma = soma(0, 0);
			System.out.println("seu resultado �: " + soma);
			menu();
			break;

		case "2":
		case "subtra��o":
			float menos = menos(0, 0);
			System.out.println("seu resultado �: " + menos);
			menu();
			break;

		case "3":
		case "multicplica��o":
			float vezes = vezes(0, 0);
			System.out.println("seu resultado �: " + vezes);
			menu();
			break;

		case "4":
		case "divis�o":
			float divisao = div(0, 0);
			System.out.println("seu resultado �: " + divisao);
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
		System.out.println("-                   Informe A��o                   -");
		System.out.println("----------------------------------------------------");

		System.out.println("1 - adi��o");
		System.out.println("2 - subtra��o");
		System.out.println("3 - multiplica��o");
		System.out.println("4 - divis�o");
		opcao = inPut.next();
		System.out.println();

		switch (opcao.toLowerCase()) {

		case "1":
		case "adi��o":
			float soma = soma(0, 0);
			System.out.println("seu resultado �: " + soma);
			break;

		case "2":
		case "subtra��o":
			float menos = menos(0, 0);
			System.out.println("seu resultado �: " + menos);
			break;

		case "3":
		case "multicplica��o":
			float vezes = vezes(0, 0);
			System.out.println("seu resultado �: " + vezes);
			break;

		case "4":
		case "divis�o":
			float divisao = div(0, 0);
			System.out.println("seu resultado �: " + divisao);
			break;

		}
	
	}
}
