package br.com.Entra21.CorFavorita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inPut = new Scanner(System.in);
		
		String estacao;
		
		System.out.println("Exiba em tela uma lista de op��es para o usu�rio escolher e para cada escolha retornar uma mensagem diferente. ");
		System.out.println();
		
		System.out.println("Qual � a sua esta��o do ano favorita? ");
		System.out.println("1 = Primavera\r\n"
							+ "2 = Outono\r\n"
							+ "3 = Inverno\r\n"
							+ "4 = Ver�o ");
		System.out.println("Informe a esta��o: ");
		estacao = inPut.next();
		System.out.println();
		

		switch (estacao) {
		
		case "1":
			System.out.println("Sua esta��o favorita � Primavera");
			break;
		case "2":
			System.out.println("Sua esta��o favorita � Outono");
			break;
		case "3":
			System.out.println("Sua esta��o favorita � Inverno");
			break;
		case "4":
			System.out.println("Sua esta��o favorita � Primavera");
			break;
		}
		
		
	}

}
