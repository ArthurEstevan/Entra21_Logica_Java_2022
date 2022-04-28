package br.com.Entra21.AreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exercício 01");

		System.out.println();

		System.out.println(
				"Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.\r\n"
						+ "Sabendo que a área é calculada com base no produto entre base e altura.\r\n"
						+ "O perímetro é obtido ao somar todos os vertices do retângulo.");

		System.out.println();

		float base, altura, area, perimetro; // Boas Patricas de Nomeclatura

		// Criar variaveis
		Scanner inPut = new Scanner(System.in);

		// Definir valores
		System.out.println("Qual a base do meu triângulo?");
		base = inPut.nextFloat();

		System.out.println("Qual a altura do meu triângulo?");
		altura = inPut.nextInt(); // continua Float mas sem a precisão decimal

		// momento de processamento
		area = base * altura; // area seria medida em 2d dentro do terreno
		perimetro = base * 2 + altura * 2; // Perimetro é em 1d ou seja medir meu terreno dando a volta nele.

		System.out.println();

		System.out.println("O resultado da área é: " + area);

		System.out.println();

		System.out.println("O resultado do perimetro é: " + perimetro);

	}

}
