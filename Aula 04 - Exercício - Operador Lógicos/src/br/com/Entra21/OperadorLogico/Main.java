package br.com.Entra21.OperadorLogico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exerc�cio de Operadores L�gicos");
		
		System.out.println("Fa�a um programa que capture tr�s informa��es: o nome, idade e altura.");
		System.out.println("Deve ser informado se o usu�rio � maior ou igual que 1,70cm E tem � maior de idade (utilizar o &&)");
		System.out.println();
		System.out.println("Fa�a um programa que capture tr�s informa��es o nome, idade e altura.");
		System.out.println("Deve ser informado se o usu�rio � maior ou igual que 1,70cm OU tem � maior de idade (utilizar o ||)");
		
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
		System.out.println("Voc� � maior de idade? " +resultado);
		System.out.println();
		System.out.println("Voc� � maior que 1,70cm de altura? " +resultado);
		
		idade= 20;
		altura= 1.60f;
		
		resultado = (altura>=1.70f) || (idade>=18f);
		
		System.out.println();
		System.out.println("Qual seu nome?");
		nome = inPut.nextLine();
		System.out.println();
		System.out.println("Voc� � maior de idade ou � maior que '1,70cm de altura? " +resultado);
	
	}

}
