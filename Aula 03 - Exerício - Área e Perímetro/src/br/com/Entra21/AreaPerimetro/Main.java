package br.com.Entra21.AreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exerc�cio �rea e Per�metro 001");

		System.out.println();

		System.out.println("Fa�a um programa que solicite a base e altura de um ret�ngulo, informe tamb�m sua �rea e perimetro.");
		System.out.println("Sabendo que a formula da �rea � A=b*h, j� a formula do per�metro � P=2(a+b).");

		System.out.println();

		
		float base, altura, area, perimetro; 

		
		Scanner inPut = new Scanner(System.in); 
		
		System.out.println("Qual a base do tri�ngulo?");
		base = inPut.nextFloat();

		System.out.println();

		System.out.println("Qual a altura do tri�ngulo?");
		altura = inPut.nextInt(); 

		System.out.println();

		area = base * altura; 

		perimetro = base * 2 + altura * 2; 

		System.out.println("O resultado da �rea � " + area + ".");
		System.out.println("O resultado do per�metro � " + perimetro + ".");

	}

}
