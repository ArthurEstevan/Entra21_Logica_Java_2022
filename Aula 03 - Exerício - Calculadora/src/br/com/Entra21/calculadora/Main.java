package br.com.Entra21.calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Fa�a um programa de calculadora:");

	    System.out.println("Capture o nome do usu�rio e dois valores num�ricos, depois exiba de forma individual o resultado de cada opera��o (+,-,/ e *)");
	    
	    System.out.println();

	    String nome;

	    double valorUm, valorDois, mais, menos, divisao, multiplicacao;

	    Scanner inPut = new Scanner(System.in);

	    System.out.println("Qual seu nome?");
	    nome = inPut.nextLine();

	    System.out.println();

	    System.out.println("Valor do n�mero 01");
	    valorUm = inPut.nextFloat();

	    System.out.println();

	    System.out.println("Valor do n�mero 02");
	    valorDois = inPut.nextFloat();

	    mais = valorUm + valorDois;
	    menos = valorUm - valorDois;
	    divisao = valorUm / valorDois;
	    multiplicacao = valorUm * valorDois;

	    System.out.println();

	    System.out.println("Soma dos valores= " + mais);
	    System.out.println("Subtra��o dos valores= " + menos);
	    System.out.println("Divis�o dos valores= " + divisao);
	    System.out.println("Multiplica��o dos valores= " + multiplicacao);

	}

}
