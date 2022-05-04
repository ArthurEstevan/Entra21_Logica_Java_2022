package br.com.Entra21.EstacaoAno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inPut = new Scanner(System.in);
		
		String cor;
		
		System.out.println("Com o mesmo formato do exercício 1 , agora aceite apenas String como resposta");
		System.out.println();
		
		System.out.println("Qual é a sua cor favorita?");
		System.out.println("Verde\r\n"
							+ "Azul\r\n"
							+ "Amarelo\r\n"
							+ "Vermelho");
		System.out.println();
		System.out.println("Escolha sua cor favorita: ");
		cor = inPut.next();
		System.out.println();
		

		switch (cor) {
		
		case "verde":
			System.out.println("Sua cor favorita é Verde");
			break;
		case "vzul":
			System.out.println("Sua cor favorita é Azul");
			break;
		case "amarelo":
			System.out.println("Sua cor favorita é Amarelo");
			break;
		case "vermelho":
			System.out.println("Sua cor favorita é Vermelho");
			break;
		}

	}

}
