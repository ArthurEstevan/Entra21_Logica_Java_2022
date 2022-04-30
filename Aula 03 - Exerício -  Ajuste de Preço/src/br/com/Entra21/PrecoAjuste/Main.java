package br.com.Entra21.PrecoAjuste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exercício Ajuste de Preço 002");

		System.out.println();
		
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto.");
		System.out.println("Depois processe um aumento de 65% e informe qual será o preço de venda.");
		System.out.println();
		
		
		Scanner inPut = new Scanner(System.in);
		
		float preco, aumento;
		
		String nome;
		
		System.out.println("Qual o nome produto?");
		nome = inPut.nextLine();
		
		System.out.println();
		System.out.println("Qual o preço do "+nome+" ?");
		preco = inPut.nextFloat();
		
		aumento = preco * (65f/100f);
		
		System.out.println();
		System.out.println(nome +" com 65% de aumento vai custar: "+ (preco+aumento));
		System.out.println(nome +" com 65% de desconto vai custar: "+ (preco-aumento));
		
		
	}

}
