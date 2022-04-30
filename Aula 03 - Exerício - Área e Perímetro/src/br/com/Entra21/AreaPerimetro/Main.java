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

		
		float base, altura, area, perimetro; 

		
		Scanner inPut = new Scanner(System.in); 
		
		System.out.println("Qual a base do triângulo?");
		base = inPut.nextFloat();

		System.out.println();

		System.out.println("Qual a altura do triângulo?");
		altura = inPut.nextInt(); 

		System.out.println();

		area = base * altura; 

		perimetro = base * 2 + altura * 2; 

		System.out.println("O resultado da área é " + area + ".");
		System.out.println("O resultado do perímetro é " + perimetro + ".");

	}

}
