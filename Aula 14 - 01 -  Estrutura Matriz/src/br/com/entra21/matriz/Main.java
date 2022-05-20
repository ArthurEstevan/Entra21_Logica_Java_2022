package br.com.entra21.matriz;

import java.util.Scanner;

class Main {

	static Scanner inPut = new Scanner(System.in);

	public static void main(String[] args) {

		// Aprendendo Matrix

		byte menu;

		do {

			System.out.println();
			System.out.println("		Choose Exercise");

			symbols();
			for (byte contador = 1; contador < 3; contador++) {
				System.out.println("| " + contador + (contador == 1 ? " - Inicilizando Matriz Tamnho Predeterminado |"
						: " - Inicilizando Matriz Tamnho Definido       |"));
				// Operador ternário
				// (expressão booleana) ? código 1 : código 2;
			}
			symbols();

			menu = inPut.nextByte();
			switch (menu) {

			case 0:
				// leave my program
				System.out.println("You chose to leave, *-* goodbye *-*");
				break;

			case 1:
				// calling function
				learnSimpleMatriz();
				break;

			case 2:
				// calling function
				learnComplexMatriz();
				break;
			}

		} while (menu != 0); // enquanto opção é diferente de zero continua meu loop

	}

	public static void learnComplexMatriz() {

		System.out.println("Aprendendo Matrizes Inicializadas e Irregulares");

		float salarioAlunos[][] = { { 1000, 1250.50f, 2500.35f }, { 2600, 3500, 4500 }, { 50000, 150000, 2000000 }, };

		byte MatrizesIrregulares[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5, 6 }, };

		String ementa[][] = {

				{ "Metodoligias ágeis", "introdução", "metodologias", "git" },
				{ "lógica com Java", "váriaveis", "constantes", "comentários", "desvios", "condicionais" },
				{ "POO", "Classes", "objetos", "Herença", "Polimorfismo", "Encapsulamento", },

		};

	}

	public static void learnSimpleMatriz() {

		System.out.println("Learn Simple Matriz");
		System.out.println("Armazenar as 3 notas de todos os 10 alunos");

		float nota[][]; // Olhe no Debug []vetores linhas []index colunas

		nota = new float[10][3];
		// primeiro indice é a quantidade de vetores
		// segundo indice é a capacidade de cada vetor
		// apenas no ultimo indice de criação pela sintaxe ficam os valores

		byte quantidadeAlunos, quantidadeNotas;

		System.out.println("how many students are?");
		quantidadeAlunos = inPut.nextByte();

		System.out.println("How many grades are?");
		quantidadeNotas = inPut.nextByte();

		// quem decide o tamanho da minha matriz é o usuário
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte alunos = 0; alunos < novasNotas.length; alunos++) {
			System.out.println("Nessa posição [" + alunos + "] temos " + novasNotas[alunos].length + " notas");

			for (byte notas = 0; notas < novasNotas[alunos].length; notas++) {
				System.out.println("\t valor da nota [" + notas + "] ===> " + novasNotas[alunos][notas]);

			}
		}

		System.out.println("Confiando que tenho no minímo 2 alunos");
		System.out.println("Olha as notas do segundo aluno");
		System.out.println(novasNotas[1][0]);
		System.out.println(novasNotas[1][1]);
		System.out.println(novasNotas[1][3]);

		// static é usado sem utilizar orientação ao objeto
	}

	public static void symbols() {

		System.out.println("=================================================");

	}
}
