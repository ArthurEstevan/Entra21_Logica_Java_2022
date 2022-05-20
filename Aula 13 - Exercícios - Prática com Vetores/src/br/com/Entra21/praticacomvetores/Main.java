package br.com.Entra21.praticacomvetores;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		// Criar um projeto java onde o main deve servir de menu para cada execução dos
		// exercícios
		// O programa só encerra ao escolher a opção SAIR ou 0
		// Antes de encerrar a execução agradecer ao usuário por utilizar o programa
		// Os cases do switch não devem ter complexidade, deve chamar os métodos
		// específicos

		Scanner inPut = new Scanner(System.in);
		byte option;

		do {

			System.out.println("    -How To-");
			System.out.println("================");
			for (byte contador = 0; contador < 7; contador++) { // using "for" to write my menu

				System.out.println("| " + contador + (contador == 0 ? " - Exit     |" : " - Exercise |"));
				// usando operador ternário para concatenar meu texto
			}
			System.out.println("================");

			option = inPut.nextByte();

			switch (option) {

			case 0:
				System.out.println("Thank you to use my program, you choose to leave.");
				// calling my function
				break;

			case 1:
				// calling my function
				createVectorPrimitiveArrays();
				break;

			case 2:
				startVectorPrimitiveArrays();
				// calling my function
				break;

			case 3:
				userFeedVector();
				// calling my function
				break;

			case 4:
				userSizeVector();
				// calling my function
				break;

			case 5:
				decrescenteCrescente();
				// calling my function
				break;

			case 6:
				creatProjectVector();
				// calling my function
				break;

			case 7:
				// calling my function
				break;

			}
		} while (option != 0);

	}

	public static void creatProjectVector() {

//		Criar um vetor de inteiros não inicializado
//		Repita indefinidamente até que o usuário responda não para a pergunta
//		Gostaria de inicializar o valor de uma das posições entre 1 e TAMANHO?
//		Caso responda sim
//		Capturar uma posição
//		Repetir a captura enquanto o índice não for válido
//		Caso responda não
//		Sair da repetição de inicializações
//		Exibir todos os valores do vetor

		int vectorInt[] = new int[10];
		Scanner inPut = new Scanner(System.in);
		String answer;
		byte index = 0;

		do {

			System.out.println("Informe um valor para [" + index + "]");
			vectorInt[index] = inPut.nextByte();

			System.out.println("Do you want to start again?");
			answer = inPut.next();

			if (answer.equalsIgnoreCase("sim")) {
				do {
					System.out.println("Info a valid index, index go of 0 " + (vectorInt.length - 1));
					index = inPut.nextByte(); // se o user digitar um valor correct vai ser usado no meu "do" principal
												// onde
												// a lógica se repete
				} while (index < 0 || index >= vectorInt.length); // posição escolhida não pode ser menor que zero nem o
																	// tamanho do vetor ou superior
																	// exemplo range valido é de 0 a 9, número acima
																	// disso
																	// fica no loop

			}
		} while (answer.equalsIgnoreCase("no"));

		for (byte contador = 0; contador < vectorInt.length; contador++) {
			System.out.println("Seu valor no [" + vectorInt[contador] + "]");
		}

	}

	public static void decrescenteCrescente() {

		// Criar um vetor de inteiros inicializado , para percorrer
		// Do inicio ao fim
		// Do fim ao inicio
		// Para exibir os valores

		int vectorStart[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		System.out.println("Crescente");
		for (byte contador = 0; contador < vectorStart.length; contador++) {

			System.out.println(+vectorStart[contador]);

		}

		System.out.println();

		System.out.println("Decrescente");
		for (byte contadorInt = (byte) (vectorStart.length - 1); contadorInt >= 0; contadorInt--) {
			// começando com o tamanho -1, porque o índice tem um valor a menos.
			// condição de permanencia, enquanto meu contador for maior do que zero, comecei
			// com um valor alto e estou diminuindo

			System.out.println(+vectorStart[contadorInt]);

		}

	}

	public static void userSizeVector() {

		// Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o
		// usuário informe os respectivos valores
		// Verificar os detalhes na perspectiva DEBUG

		byte sizeVector[]; // criamos primeiro nosso vetor para nos próximos passos atribuir valor

		byte size; // precisa de uma váriavel para definir o tamanho do vetor

		Scanner inPut = new Scanner(System.in);

		System.out.println("What size your vector?");
		size = inPut.nextByte(); // captura do tamanho do vetor

		sizeVector = new byte[size]; // aqui atribuimos o valor que o usuário decidiu ao meu vetor

		for (byte contador = 0; contador < sizeVector.length; contador++) {

			System.out.println("What your value " + (contador + 1) + " index [" + contador + "]");
			sizeVector[contador] = inPut.nextByte();

		}

	}

	public static void userFeedVector() {

		// Criar 1 vetor de 5 posições, para que o usuário alimente esses valores
		// Verificar os detalhes na perspectiva DEBUG

		byte vetorPosicao[] = new byte[5];
		Scanner inPut = new Scanner(System.in);

		for (byte contador = 0; contador < vetorPosicao.length; contador++) {
			System.out.println("Start position " + (contador + 1) + " index " + contador);
			vetorPosicao[contador] = inPut.nextByte();

		}

		System.out.println();
		System.out.println("Size Vector List: " + vetorPosicao.length);
		System.out.println("Positon in Vector List index [1] " + vetorPosicao[0]);
		System.out.println("Positon in Vector List index [2] " + vetorPosicao[1]);
		System.out.println("Positon in Vector List index [3] " + vetorPosicao[2]);
		System.out.println("Positon in Vector List index [4] " + vetorPosicao[3]);
		System.out.println("Positon in Vector List index [5] " + vetorPosicao[4]);
	}

	public static void startVectorPrimitiveArrays() {

		// Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles
		// no console
		// Verificar os detalhes na perspectiva DEBUG

		byte vetorBytes[] = { 10 };

		short vetorShorts[] = { 20, 30 };

		int vetorInts[] = { 40, 50, 60 };

		long vetorLongs[] = { 70, 80, 90, 100 };

		float vetorFloats[] = { 110, 120, 130, 140 };

		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e' };

		double vetorDoubles[] = { 110, 120, 130, 140, 150, 160 };

		boolean vetorBooleans[] = { true, false, true, false };

		System.out
				.println("See the size index [0] " + vetorBytes[0] + " either see the size array " + vetorBytes.length);
		System.out.println(
				"See the size index [1] " + vetorShorts[1] + " either see the size array " + vetorShorts.length);
		System.out.println("See the size index [2] " + vetorInts[2] + " either see the size array " + vetorInts.length);
		System.out
				.println("See the size index [3] " + vetorLongs[3] + " either see the size array " + vetorLongs.length);
		System.out.println(
				"See the size index [3] " + vetorFloats[3] + " either see the size array " + vetorFloats.length);
		System.out
				.println("See the size index [4] " + vetorChars[4] + " either see the size array " + vetorChars.length);
		System.out.println(
				"See the size index [5] " + vetorDoubles[5] + " either see the size array " + vetorDoubles.length);
		System.out.println(
				"See the size index [3] " + vetorBooleans[3] + " either see the size array " + vetorBooleans.length);

	}

	public static void createVectorPrimitiveArrays() {

		// Criar vetores para cada tipo primitivo e exibir o tamanho deles no console
		// Verificar os detalhes na perspectiva DEBUG

		byte vetorBytes[] = new byte[1];

		short vetorShorts[] = new short[2];

		int vetorInts[] = new int[3];

		long vetorLongs[] = new long[4];

		float vetorFloats[] = new float[5];

		char vetorChars[] = new char[6];

		double vetorDoubles[] = new double[7];

		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanho " + vetorBytes.length);
		System.out.println("vetorBytes tamanho " + vetorShorts.length);
		System.out.println("vetorBytes tamanho " + vetorInts.length);
		System.out.println("vetorBytes tamanho " + vetorLongs.length);
		System.out.println("vetorBytes tamanho " + vetorFloats.length);
		System.out.println("vetorBytes tamanho " + vetorChars.length);
		System.out.println("vetorBytes tamanho " + vetorDoubles.length);
		System.out.println("vetorBytes tamanho " + vetorBooleans.length);
	}
}
