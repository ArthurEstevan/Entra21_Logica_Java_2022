package br.com.Entra21.AreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exercício Área e Perímetro 001");

		System.out.println();

		System.out.println("Faça um programa que solicite a base e altura de um retângulo, informe também sua área e perimetro.");
		System.out.println("Sabendo que a formula da área é A=b*h, já a formula do perímetro é P=2(a+b).");

		System.out.println();

		// CRIAR VARIAVEIS
		float base, altura, area, perimetro; // CRIAR PRATICA DE BOAS NOMECLATURAS.

		// OBJETO DA CLASSE 'Scanner' PRECISA UTILIZAR O '(System.in)' PARA TER ACESSO AO TECLADO.
		Scanner inPut = new Scanner(System.in); // CRIAR CLASSE SCANNER PARA DIGITAÇÃO DE INFORMAÇÕES NO CONSOLE.
		// 'new Scanner' SIGNIFICA CONSTRUA UM OBJETO DA CLASSE 'Scanner' E ATRIBUA NA
		// VARIAVEL ENTRADA.

		// DEFINIR VALORES
		System.out.println("Qual a base do triângulo?");
		base = inPut.nextFloat();

		System.out.println();

		System.out.println("Qual a altura do triângulo?");
		altura = inPut.nextInt(); // CONTINUA 'Float' MAS SEM A PRECISÃO DECIMAL.

		System.out.println();

		// MOMENTO DE PROCESSAMENTO
		area = base * altura; // ÁREA É A MEDIDA EM 2D.

		perimetro = base * 2 + altura * 2; // PERÍMETRO É A MEDIDA EM 1D.

		System.out.println("O resultado da área é " + area + ".");
		System.out.println("O resultado do perímetro é " + perimetro + ".");

	}

}
