package br.com.Entra21.OperadorLogico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exercício de Operadores Lógicos");
		System.out.println();
		
		System.out.println("01 - Faça um programa que capture três informações: o nome, idade e altura.");
		System.out.println("Deve ser informado se o usuário é maior ou igual que 1,70cm, e tem é maior de idade (utilizar o &&)");
		System.out.println();
		System.out.println("02 - Faça um programa que capture três informações: o nome, idade e altura.");
		System.out.println("Deve ser informado se o usuário é maior ou igual que 1,70cm ou tem é maior de idade (utilizar o ||)");
		
		Scanner inPut = new Scanner(System.in);
		
		String nome;
		byte idade;
		float altura;
		boolean resultado;
		
		System.out.println();
		System.out.println("Qual seu nome?");
		nome = inPut.nextLine();
		System.out.println();
		System.out.println("Qual sua idade?");
		idade = inPut.nextByte();
		System.out.println();
		System.out.println("Qual sua altura?");
		altura = inPut.nextFloat();
		
		resultado = (altura >= 1.70f) && (idade >= 18f);
		
		System.out.println();
		System.out.println(resultado + " pro seu teste de maior de idade e maior que 1,70cm.");
	
		resultado = (altura>=1.70f) || (idade>=18f);

		System.out.println(resultado + " pro seu teste de maior de idade ou maior que 1,70cm.");
		System.out.println();
		
	}

}
