package br.com.Entra21.exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inPut = new Scanner(System.in);
		String opcao;
		
		System.out.println("01 - Exerc�cio Calculadora");
		System.out.println("02 - Exerc�cio Curr�culo");
		System.out.println();
		System.out.println("Escolha o exerc�cio:");
		opcao = inPut.nextLine();
		
		switch (opcao.toLowerCase()) {
		case "1":
		case "calculadora":
			calculadora();
			break;
			
		case "2":
		case "curr�culo":
			curriculo();
		}
		
		
		
		
	}
	
	public static void calculadora() {
		
		Scanner inPut = new Scanner(System.in);
		
		float numeroA, numeroB, div, vezes, soma, menos;
		byte operacao;
		
		
		System.out.println();
		System.out.println("N�mero:");
		numeroA = inPut.nextFloat();
		
		System.out.println();
		
		System.out.println("N�mero:");
		numeroB = inPut.nextFloat();
		
		System.out.println();
		
		System.out.println("Escolha Opera��o: \r\n"
						 + "1 - Adi��o\r\n"
						 + "2 - Subtra��o\r\n"
						 + "3 - Multiplica��o\r\n"
						 + "4 - Divis�o\r\n");
		operacao = inPut.nextByte();
		
		switch (operacao) {
		case 1:
			soma = numeroA + numeroB;
			System.out.println("sua resposta �: " +soma);
			break;
		case 2:
			menos = numeroA - numeroB;
			System.out.println("sua resposta �: " +menos);
			break;
		case 3:
			vezes = numeroA * numeroB;
			System.out.println("sua resposta �: " +vezes);
			break;
		case 4:
			div = numeroA / numeroB;
			System.out.println("sua resposta �: " +div);
			break;

		default:
			System.out.println("A��o invalida");
			break;
		}
		
		System.out.println();
		System.out.println("Calculadora Simples");

	}

	public static void curriculo() {
		
		Scanner inPut = new Scanner(System.in);
		
		String nome, emprego, nacionalidade;
		byte data;
		
		System.out.println("Qual seu Nome?");
		nome = inPut.nextLine();
		System.out.println();
		
		System.out.println("Qual seu Emprego?");
		emprego = inPut.nextLine();
		System.out.println();
		
		System.out.println("Qual sua Nacionalidade?");
		nacionalidade = inPut.nextLine();
		System.out.println();
		
		System.out.println("Qual sua data de nascimento?");
		data = inPut.nextByte();
		System.out.println();
		
		System.out.println("Qual seu nome?");
		nome = inPut.nextLine();
		System.out.println();
		
		System.out.println("Qual seu nome?");
		nome = inPut.nextLine();
		System.out.println();
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println("Nome: " +nome);
		
	
	
	}
}
