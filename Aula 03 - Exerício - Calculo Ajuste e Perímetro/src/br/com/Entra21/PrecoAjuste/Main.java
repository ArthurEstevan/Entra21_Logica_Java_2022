package br.com.Entra21.PrecoAjuste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exerc�cio Preco e Per�metro 001");

		System.out.println();
		
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto.");
		System.out.println("Depois processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		System.out.println();
		
		
		Scanner inPut = new Scanner(System.in);
		
		float preco, aumento;
		
		String nome;
		
		System.out.println("Qual o nome produto?");
		nome = inPut.nextLine();
		
		System.out.println();
		System.out.println("Qual o pre�o do "+nome+" ?");
		preco = inPut.nextFloat();
		
		aumento = preco * (65f/100f);
		
		System.out.println();
		System.out.println("Meu produto com 65% de aumento vai custar: "+ (preco+aumento));
		System.out.println();
		System.out.println("Meu produto com 65% de desconto vai custar: "+ (preco-aumento));
		
		
	}

}
