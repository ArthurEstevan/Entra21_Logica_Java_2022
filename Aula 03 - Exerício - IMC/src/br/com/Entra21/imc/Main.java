package br.com.Entra21.imc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("Fa�a um programa que calcule o IMC.");

	    System.out.println( "O IMC � o �ndice de Massa Corp�rea � calculado com a formula: IMC=Peso/Altura�.");

	    System.out.println();
			
			String nome;
			float peso, altura, imc;

			Scanner inPut = new Scanner(System.in);
			
			System.out.println("Qual seu nome?");
			nome = inPut.nextLine();

			System.out.println();
			
			System.out.println("Qual seu peso?");
			peso = inPut.nextFloat();

			System.out.println();
			
			System.out.println("Qual sua altura?");
			altura = inPut.nextFloat();

			altura = altura * altura;

			System.out.println();
			
			System.out.println( nome + " seu �ndice de IMC �: " + peso / altura + ".");

	}

}
