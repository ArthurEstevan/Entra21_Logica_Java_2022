package br.com.Entra21.AreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exerc�cio 01");

		System.out.println();

		System.out.println(
				"Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.\r\n"
						+ "Sabendo que a �rea � calculada com base no produto entre base e altura.\r\n"
						+ "O per�metro � obtido ao somar todos os vertices do ret�ngulo.");

		System.out.println();

		float base, altura, area, perimetro; // Boas Patricas de Nomeclatura

		// Criar variaveis
		Scanner inPut = new Scanner(System.in);

		// Definir valores
		System.out.println("Qual a base do meu tri�ngulo?");
		base = inPut.nextFloat();

		System.out.println("Qual a altura do meu tri�ngulo?");
		altura = inPut.nextInt(); // continua Float mas sem a precis�o decimal

		// momento de processamento
		area = base * altura; // area seria medida em 2d dentro do terreno
		perimetro = base * 2 + altura * 2; // Perimetro � em 1d ou seja medir meu terreno dando a volta nele.

		System.out.println();

		System.out.println("O resultado da �rea �: " + area);

		System.out.println();

		System.out.println("O resultado do perimetro �: " + perimetro);

	}

}
