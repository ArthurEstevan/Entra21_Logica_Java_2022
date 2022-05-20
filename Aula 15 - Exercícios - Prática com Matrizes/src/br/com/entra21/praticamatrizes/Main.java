package br.com.entra21.praticamatrizes;

import java.util.Scanner;

public class Main {

	static Scanner inPut = new Scanner(System.in);

	public static void main(String[] args) {

//		Praticando a manipulação de matrizes com laços de repetição

//		Criar um projeto java onde o main deve servir de menu para cada execução dos exercícios
//		O programa só encerra ao escolher a opção SAIR ou 0
//		Antes de encerrar a execução agradecer ao usuário por utilizar o programa
//		Os cases do switch não devem ter complexidade, deve chamar os métodos específicos
//		Opções no menu

		byte option;

		do {

			switch (option = startMenu()) {

			case 0:
				// calling my function
				System.out.println("*_* GoodBye *_*");
				break;

			case 1:
				// calling my function
				creatMatrizTwoLevel();
				break;

			case 2:
				// calling my function
				initializeMatrizTwoLevel();
				break;

			case 3:
				// calling my function
				matrizFivePosition();

				break;

			case 4:
				// calling my function
				userCreatFullMatriz();
				break;

			case 5:
				// calling my function

				break;

			case 6:
				// calling my function

				break;

			default:
				System.out.println("Choose the Correct Option");
				main(null);
				break;
			}

		} while (option != 0);

	}

	public static void symbl() {
		System.out.println("==============");
	}

	public static byte startMenu() {

		System.out.println("Choose the Option");
		symbl();
		for (byte count = 0; count < 7; count++) {
			System.out.println("| " + count + (count == 0 ? " Exit     |" : " Exercise |"));
		}
		symbl();

		return inPut.nextByte();
	}

	public static void creatMatrizTwoLevel() {

//		1- Criar matrizes de 2 níveis para cada tipo primitivo e exibir o tamanho deles no console
//		Verificar os detalhes na perspectiva DEBUG

		byte matrizBytes[][] = new byte[1][1]; // Vetores == Linhas [1] | Index == Colunas [1]

		char matrizChars[][] = new char[2][2]; // Vetores == Linhas [2] | Index == Colunas [2]

		int matrizInts[][] = new int[3][3]; // Vetores == Linhas [3] | Index == Colunas [3]

		long matrizLongs[][] = new long[4][4]; // Vetores == Linhas [4] | Index == Colunas [4]

		float matrizFloats[][] = new float[5][5]; // Vetores == Linhas [5] | Index == Colunas [5]

		double matrizDoubles[][] = new double[6][6]; // Vetores == Linhas [6] | Index == Colunas [6]

		boolean matrizBooleans[][] = new boolean[7][7]; // Vetores == Linhas [7] | Index == Colunas [7]

		short matrizShorts[][] = new short[8][8]; // Vetores == Linhas [8] | Index == Colunas [8]

		System.out.println(
				"Tamanho matrizBytes " + matrizBytes.length + " cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println(
				"Tamanho matrizChars " + matrizChars.length + " cada vetor tem tamanho " + matrizChars[0].length);
		System.out
				.println("Tamanho matrizInts " + matrizInts.length + " cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println(
				"Tamanho matrizLongs " + matrizLongs.length + " cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println(
				"Tamanho matrizFloats " + matrizFloats.length + " cada vetor tem tamanho " + matrizFloats[0].length);
		System.out.println(
				"Tamanho matrizDoubles " + matrizDoubles.length + " cada vetor tem tamanho " + matrizDoubles[0].length);
		System.out.println("Tamanho matrizBooleans " + matrizBooleans.length + " cada vetor tem tamanho "
				+ matrizBooleans[0].length);
		System.out.println(
				"Tamanho matrizShorts " + matrizShorts.length + " cada vetor tem tamanho " + matrizShorts[0].length);

	}

	public static void initializeMatrizTwoLevel() {

//		2- Criar matrizes de 2 níveis inicializados para cada tipo primitivo e exibir o tamanho deles no console
//		Verificar os detalhes na perspectiva DEBUG

		char matrizChars[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 'A', 'E', 'V' }, { 'R', 'D', 'O' }, { 'F', 'F', 'C', 'A' }, // irregular porque tem tamanhos diferente
																				// de index
		};

		boolean matrizBooleans[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ true, false, true, false }, { true, false, true, false }, { true, false, true, false }, // regular
																											// porque
																											// todos a
																											// mesma
																											// capacidade
																											// de itens
																											// por
																											// vetores
		};

		byte matrizBytes[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 10, 20, 30, 44, 50 }, { 11, 22, 33 }, { 13, 24 }, { 18 }, // irregular porque tem tamanhos diferente
																			// de index
		};

		short matrizShorts[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 300, 400, 1000 }, { 500, 600, 100 }, { 1000, 4000, 5000 }, // regular porque todos a mesma capacidade
																				// de itens por vetores
		};

		int matrizInts[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100 }, { 200 }, { 10000 }, // regular porque todos a mesma capacidade de itens por vetores
		};

		long matrizLongs[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 300, 400, 500, 600 }, { 10000000, 5000000, 300 }, { 1000000, 100000 }, // irregular porque tem
																							// tamanhos diferente de
																							// index
		};

		float matrizFloats[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100000f }, { 20000f, 30000f }, { 30000000000f }, // irregular porque tem tamanhos diferente de index
		};

		double matrizDoubles[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100, 400, 500 }, { 100, 200, 400 }, { 1000, 4000, 5000, 6000 }, // irregular porque tem tamanhos
																					// diferente de index
		};

		System.out.println(
				"Tamanho matrizBytes " + matrizBytes.length + " cada vetor tem tamanho " + matrizBytes[0].length);
		System.out.println(
				"Tamanho matrizChars " + matrizChars.length + " cada vetor tem tamanho " + matrizChars[0].length);
		System.out
				.println("Tamanho matrizInts " + matrizInts.length + " cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println(
				"Tamanho matrizLongs " + matrizLongs.length + " cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println(
				"Tamanho matrizFloats " + matrizFloats.length + " cada vetor tem tamanho " + matrizFloats[0].length);
		System.out.println(
				"Tamanho matrizDoubles " + matrizDoubles.length + " cada vetor tem tamanho " + matrizDoubles[0].length);
		System.out.println("Tamanho matrizBooleans " + matrizBooleans.length + " cada vetor tem tamanho "
				+ matrizBooleans[0].length);
		System.out.println(
				"Tamanho matrizShorts " + matrizShorts.length + " cada vetor tem tamanho " + matrizShorts[0].length);

	}

	public static void matrizFivePosition() {

//		3- Criar 1 matriz de 5 posições com 3 itens de capacidade, para que o usuário alimente esses valores
//		Verificar os detalhes na perspectiva DEBUG

		byte matrizBytes[][] = new byte[5][3];

		System.out.println("Para o primeiro vetor, informe o primeiro valor:");
		matrizBytes[0][0] = inPut.nextByte();

		System.out.println("Para o primeiro vetor, informe o segundo valor:");
		matrizBytes[0][1] = inPut.nextByte();

		System.out.println("Para o primeiro vetor, informe o terceiro valor:");
		matrizBytes[0][2] = inPut.nextByte();

		// --------------------------------------------------------------------

		System.out.println("Para o segundo vetor, informe o primeiro valor:");
		matrizBytes[1][0] = inPut.nextByte();

		System.out.println("Para o segundo vetor, informe o segundo valor:");
		matrizBytes[1][1] = inPut.nextByte();

		System.out.println("Para o segundo vetor, informe o terceiro valor:");
		matrizBytes[1][2] = inPut.nextByte();

		for (byte vetor = 2; vetor < matrizBytes.length; vetor++) {// [2][3][4]// Continuando minha captura com FOR

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				System.out.println("Para o " + (vetor + 1) + "ª vetor informe o " + (detalhe + 1) + "ª valor");
				matrizBytes[vetor][detalhe] = inPut.nextByte();

			}

		}
	}

	public static void userCreatFullMatriz() {

//		4- Criar uma matriz com o tamanho  e capacidade informada pelo usuário e depois solicitar que o usuário informe os respectivos valores
//		Verificar os detalhes na perspectiva DEBUG

		byte matrizBytes[][];

		byte tamanhoVetor, tamanhoDetail;

		System.out.println("Quantos vetores você quer na sua Matriz?");
		tamanhoVetor = inPut.nextByte();

		System.out.println("Quantos detalhes você quer em cada vetor?");
		tamanhoDetail = inPut.nextByte();

		matrizBytes = new byte[tamanhoVetor][tamanhoDetail];

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detail = 0; detail < matrizBytes[vetor].length; detail++) {

				System.out.println("Para o indice [" + vetor + "] meu tamanho é [" + detail + "] informe o valor");
				matrizBytes[vetor][detail] = inPut.nextByte();
			};
		};

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detail = 0; detail < matrizBytes[vetor].length; detail++) {

				System.out.println("Para o indice [" + vetor + "] meu tamanho é [" + detail + "] " +matrizBytes[vetor][detail]);
			}
			;
		};

	}

}
