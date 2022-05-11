package br.com.entra21.whilestrutura;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ------APRENDENDO ESTRUTURA WHILE / DO WHILE------//
		System.out.println("============================");
		System.out.println("| 0 - Exit the Program     |");
		System.out.println("| 1 - Run While            |");
		System.out.println("| 2 - Run Do While         |");
		System.out.println("============================");
		System.out.println();

		// ------CRIAÇÃO DO MENU------//
		switch (new Scanner(System.in).next().toLowerCase()) { // Instanciando um objeto da classe Scanner e já
																// utilizando o método next

		case "0", "exit":
			System.out.println("You choose exit");
			break;

		case "1", "while":
			learnWhile();

			break;

		case "2", "do while":
			learnDoWhile();

			break;

		default:
			System.out.println("Opção invalida");
			main(null); // Escolhas inválidas voltam param o método Main. (null é usado para informar
						// nenhum valor)
			break;
		}

	}

	// -------APRENDENDO WHILE-------//
	public static void learnWhile() {

		System.out.println("Let's go learn While here");

		byte contagem = 1;

		while (contagem <= 10) { // condição de permanencia
			System.out.println("Contando" + contagem); // para fazer uma contagem em forma de repetição é gerado muito
														// código
			contagem++;
		}

		System.out.println("finish first stage");

		System.out.println();
		Scanner inPut = new Scanner(System.in);

		System.out.println("What do you do?");
		String resposta = inPut.next().toUpperCase();

		System.out.println(); // equals usado para comprar a variavel com a resposta do Input
		while (resposta.equalsIgnoreCase("continuar") || resposta.equals("SIM")) { // aceita qualquer resposta no meu
																					// inPut mas transforma em mínusculo
																					// sem mudar o que foi passado
			System.out.println("Your answer is this here " + resposta);
			System.out.println("Do you want to repeat answer?");
			resposta = inPut.next().toUpperCase();
		}

		main(null);
	}

	// -------APRENDENDO DO WHILE-------//
	public static void learnDoWhile() {
		System.out.println("Let's go learn Do While");

		Scanner inPut = new Scanner(System.in);
		String reposta;

		do { // primeiro executa o escopo do código 'do'
			System.out.println("Quer repetir?");
			reposta = inPut.next();
		} while (reposta.equalsIgnoreCase("repetir")); // enquanto digitar repetir fica preso dentro do meu loop
		System.out.println();

		// EXEMPLO 01
		byte dia;
		
		do {
			System.out.println("Enter the day your birthday:");
			dia = inPut.nextByte();
		} while (dia > 31); // repetir enquanto informar dia maior que 31
		System.out.println();
		System.out.println("Understand, right? -__-");
		System.out.println();

		// EXEMPLO 02
		byte mes;
		byte contador = 0;

		do {
			System.out.println("Enter your date birthday:");
			System.out.println();

			System.out.println("Enter the day your birthday:");
			dia = inPut.nextByte();
			System.out.println("Enter the month your birthday:");
			mes = inPut.nextByte();
			contador++; // serve para contar quantas vezes você passou dentro desse "do"
		} while (dia < 1 || dia > 31 || mes < 1 || mes > 12); // Validação para poder sair do meu loop

		System.out.println();
		System.out.println("Congratulation do you undestand " + --contador); // --contador serve para limpar o lixo que
																				// o contador soma quando passa pelo
																				// loop (mas só se você não errou
																				// nenhuma)
		System.out.println();

		main(null);
	}

}
