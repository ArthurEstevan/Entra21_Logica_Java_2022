package br.com.Entra21.OperadorLogico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exercício de Operadores Lógicos");
		
		System.out.println("Faça um programa que capture três informações: o nome, idade e altura.");
		System.out.println("Deve ser informado se o usuário é maior ou igual que 1,70cm E tem é maior de idade (utilizar o &&)");
		System.out.println();
		System.out.println("Faça um programa que capture três informações o nome, idade e altura.");
		System.out.println("Deve ser informado se o usuário é maior ou igual que 1,70cm OU tem é maior de idade (utilizar o ||)");
		
		Scanner inPut = new Scanner(System.in);
		
		String nome;
		byte idade= 19;
		float altura= 1.82f;
		boolean resultado;
		
		resultado = (altura>=1.70f) && (idade>=18f);
		
		System.out.println();
		System.out.println("Qual seu nome?");
		nome = inPut.nextLine();
		System.out.println();
		System.out.println("Você é maior de idade? " +resultado);
		System.out.println();
		System.out.println("Você é maior que 1,70cm de altura? " +resultado);
		
		idade= 20;
		altura= 1.60f;
		
		resultado = (altura>=1.70f) || (idade>=18f);
		
		System.out.println();
		System.out.println("Qual seu nome?");
		nome = inPut.nextLine();
		System.out.println();
		System.out.println("Você é maior de idade ou é maior que '1,70cm de altura? " +resultado);
	
	}

}
