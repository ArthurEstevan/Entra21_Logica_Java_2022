package br.com.Entra21.CorFavorita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inPut = new Scanner(System.in);
		
		String estacao;
		
		System.out.println("Exiba em tela uma lista de opções para o usuário escolher e para cada escolha retornar uma mensagem diferente. ");
		System.out.println();
		
		System.out.println("Qual é a sua estação do ano favorita? ");
		System.out.println("1 = Primavera\r\n"
							+ "2 = Outono\r\n"
							+ "3 = Inverno\r\n"
							+ "4 = Verão ");
		System.out.println("Informe a estação: ");
		estacao = inPut.next();
		System.out.println();
		

		switch (estacao) {
		
		case "1":
			System.out.println("Sua estação favorita é Primavera");
			break;
		case "2":
			System.out.println("Sua estação favorita é Outono");
			break;
		case "3":
			System.out.println("Sua estação favorita é Inverno");
			break;
		case "4":
			System.out.println("Sua estação favorita é Primavera");
			break;
		}
		
		
	}

}
