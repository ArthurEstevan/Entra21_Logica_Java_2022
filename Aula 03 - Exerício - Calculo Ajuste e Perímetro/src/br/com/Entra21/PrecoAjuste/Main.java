package br.com.Entra21.PrecoAjuste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		
		Scanner inPut = new Scanner(System.in);
		
		float preco, aumento;
		
		String nome;
		
		System.out.println("Qual o nome produto?");
		nome = inPut.nextLine();
		
		System.out.println("Qual o pre�o do "+nome+" ?");
		preco = inPut.nextFloat();
		
		aumento = preco * (65f/100f);
		
		System.out.println("Meu produto com aumento vai custar: "+ (preco+aumento));
		
		System.out.println("Meu produto com desconto vai custar "+ (preco-aumento));
		
		
	}

}
