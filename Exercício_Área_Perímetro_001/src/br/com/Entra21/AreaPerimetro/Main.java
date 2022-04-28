package br.com.Entra21.AreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exerc�cio �rea e Per�metro 001");

		System.out.println();

		System.out.println(
				"Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.\r\n"
						+ "Sabendo que a �rea � calculada com base no produto entre base e altura.\r\n"
						+ "O per�metro � obtido ao somar todos os vertices do ret�ngulo.");

		System.out.println();

		// CRIAR VARIAVEIS
		float base, altura, area, perimetro; // CRIAR PRATICA DE BOAS NOMECLATURAS.

		// OBJETO DA CLASSE 'Scanner' PRECISA UTI�OZAR O '(System.in)' PARA TER ACESSO
		// AO TECLADO.
		Scanner inPut = new Scanner(System.in); // CRIAR CLASSE SCANNER PARA DIGITA��O DE INFORMA��ES NO CONSOLE.
		// 'new Scanner' SIGNIFICA CONSTRUA UM OBJETO DA CLASSE 'Scanner' E ATRIBUA NA
		// VARIAVEL ENTRADA.

		// DEFINIR VALORES
		System.out.println("Qual a base do tri�ngulo?");
		base = inPut.nextFloat();

		System.out.println();

		System.out.println("Qual a altura do tri�ngulo?");
		altura = inPut.nextInt(); // CONTINUA 'Float' MAS SEM A PRECIS�O DECIMAL.

		System.out.println();

		// MOMENTO DE PROCESSAMENTO
		area = base * altura; // �REA � A MEDIDA EM 2D.

		perimetro = base * 2 + altura * 2; // PER�METRO � A MEDIDA EM 1D.

		System.out.println("O resultado da �rea � '" + area + "', o resultado do per�metro � '" + perimetro + "'.");

	}

}
