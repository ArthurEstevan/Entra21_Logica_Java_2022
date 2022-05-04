package br.com.Entra21.EscolaNula;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inPut = new Scanner(System.in);
		
		String series;
		
		System.out.println("Escreva um menu de opções e trate a situação onde o usuário não escolha uma opção informada na lista");
		System.out.println();
		
		System.out.println("What your favorites TV series?");
		System.out.println("AmericansGODS\r\n"
							+ "Supernatural\r\n"
							+ "The Big-Bang: Theory\r\n"
							+ "Brooklyn 99");
		System.out.println();
		System.out.println("Choose your favorite TV serie: ");
		series = inPut.next();
		System.out.println();
		

		switch (series) {
		
		case "AmericansGODS":
			System.out.println("Very good");
			break;
		case "Supernatural":
			System.out.println("I never fineshed this serie.");
			break;
		case "The Big-Bang: Theory":
			System.out.println("This serie is very funny.");
			break;
		case "Brooklyn 99":
			System.out.println("I loved watching this series");
			break;
		default:
			System.out.println("I'm feeling blue for you... :(");
			break;
		}

	}

}
