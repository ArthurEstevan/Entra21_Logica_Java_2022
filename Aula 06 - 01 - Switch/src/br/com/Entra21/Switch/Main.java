package br.com.Entra21.Switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inPut = new Scanner(System.in);

		System.out.println("Aprendendo Switch");

		System.out.println("Serve pra escolher entre opções pré definidas");

		System.out.println("Geralmente quando há muito if else ifs baseados em igualdade");
		System.out.println();

		float altura = 1.5f;

		/*
		  if (altura == 1) { System.out.println("é baixinho"); } else if (altura ==
		  1.2) { System.out.println("continua baixinho"); } else if (altura ==1.5) {
		  System.out.println("baixinho mas nem tanto"); } else {
		  System.out.println("já não é considerado baixinho"); }
		 */

		System.out.println("1 = intervalo");
		System.out.println("2 = Exercício");
		System.out.println("3 = Prova");
		System.out.println();

		byte opcao;

		System.out.println("Escolha a opção três");
		System.out.println("Ou escolha outra opção...");
		opcao = inPut.nextByte();

		System.out.println();

		switch (opcao) {
		case 1:
			System.out.println("Vamos para o Intervalo");
			break;

		case 2:
			System.out.println("Daqui apouco tem exercício");
			break;

		case 3:
			System.out.println("Era dia cinco mais podemos fazer hoje");
			break;

		}

		System.out.println();
		String resposta;
		System.out.println("Queremos intervalo?");
		resposta = inPut.next();

		switch (resposta) {
		case "sim":
			System.out.println("Hoje foi na hora");
			break;

		case "não":
			System.out.println("Hoje não foi na hora");
			break;

		default:
			System.out.println("era uma pergunta tão simples");
			break;
		}
		
	System.out.println();

	
	System.out.println("Escolha um número");
	System.out.println("'1' para azul");
	System.out.println("'2' para vermelho");
	resposta = inPut.next();
	
	
	switch (resposta) {
	
	case "1":
		System.out.println("I'm feels blue");
		break;
		
	case "2":
		System.out.println("I'm love red color.");
		break;
	
	default:
		System.out.println("Nada");
		break;	
	}
	
	
	
	}

}
