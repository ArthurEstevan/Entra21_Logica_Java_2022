package br.com.entra21.estruturavetores;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner inPut = new Scanner(System.in);
		byte option;

		do {

			System.out.println("0- Exit");
			System.out.println("01- Declarando Vetores");
			System.out.println("02- Acessando Indices");
			System.out.println("03- Atribuindo Valores nos Indices");
			System.out.println("04- Médias com Vetores");
			option = inPut.nextByte();

			switch (option) {

			case 0:
				// meu case vazio só para não cair no default porque o zero atendendo a condição
				// de saída.
				System.out.println("You choose exit, goodbye!");
				break;

			case 1:
				// chamada de função
				declararVetores(); // dentro desses paranteses estariam meus argumentos se tivesse
				break;
			case 2:
				// chamada de função
				acessandoIndices(); // dentro desses paranteses estariam meus argumentos se tivesse
				break;
			case 3:
				// chamada de função
				atribuindoValorIndice(); // dentro desses paranteses estariam meus argumentos se tivesse
				break;
			case 4:
				// chamada de função
				mediaVetores(); // dentro desses paranteses estariam meus argumentos se tivesse
				break;

			}

		} while (option != 0); // condição de permanencia vai ser enquanto o usuário não digitar 0.

	}

	// ------DECLARING VECTORS------//
	public static void declararVetores() { // esse parenteses da função é um parâmetro porque não tem nada nele

		byte idades[]; // primeiro crie o vetor atribuindo uma váriavel

		idades = new byte[15]; // define o tamanho da variavel

		System.out.println("O tamanho é " + idades.length); // depois usar ou atualizar
	}

	// ------ACCESSING VECTORS------//
	public static void acessandoIndices() { // esse parenteses da função é um parâmetro porque não tem nada nele

		float notas[] = { 1, 3.5f, 8 }; // 1° crie o vetor atribuindo uma váriavel 2° define o tamanho da variavel e
										// valor respectivamente

		System.out.println("Quantas notas tem na lista? " + notas.length); // mostra qual tamanho do meu vetor

		// Acessando cada posição do meu vetor

		System.out.println("O que tem no indice [1] " + notas[1]);

		System.out.println("O que tem no ultimo indice " + notas[2]);
		notas[2] = 105.5f;// alterando valor da minha nota '2'

		System.out.println("Consgio acessar o indice 10? " + notas[10]);
		// não é possivel acessar um indice que não existe

	}

	// ------ASSINGING VALUES------//
	public static void atribuindoValorIndice() { // esse parenteses da função é um parâmetro porque não tem nada nele

		byte idades[]; // primeiro crie o vetor atribuindo uma váriavel

		idades = new byte[15]; // define o tamanho da variavel

		idades[0] = 33; // manda uma idade para a variavel "0"

		idades[9] = 12; // manda uma idade para variavel "9"

		String alunos[] = new String[20]; // cria meu vetor na linha

		Scanner inPut = new Scanner(System.in); // Creat my Scanner for capture

		for (byte contador = 0; contador < alunos.length; contador++) { // definindo quantas repetioções terá no meu
																		// "FOR"

			System.out.println("Qual o nome do aluno " + contador + "?"); // perguntando os nomes

			alunos[contador] = inPut.next(); // usando esse capture você já vai atribuir os nomes aos valores do meu
												// vetor
		}
	}

	// ------SCHOOL GRADES------//
	public static void mediaVetores() { // esse parenteses da função é um parâmetro porque não tem nada nele

		float notasAlunos[]; // primeiro crie o vetor atribuindo uma váriavel

		notasAlunos = new float[3]; // define o tamanho da váriavel

		notasAlunos[0] = 7; // manda um valor para a variavel "0"

		notasAlunos[1] = 9; // manda um valor para a variavel "1"

		notasAlunos[2] = 10; // manda um valor para a variavel "2"

		// fazendo a divição da media usando apenas uma variavel
		float media = (notasAlunos[0]) + (notasAlunos[1]) + (notasAlunos[2]) / notasAlunos.length; // length seria o
																									// valor do meu
																									// vetor
		System.out.println(media); // resultado

		// ------EASY MODE------//

		float notaAluno[] = new float[3];

		Scanner inPut = new Scanner(System.in);

		for (byte contador = 0; contador < notaAluno.length; contador++) { // meu for vai ter a repetição do tamanho
																			// do meu vetor

			System.out.println("Informe e " + (contador + 1) + "ª nota:"); // aqui concateno meu texto ( (contador+1) )
																			// serve apenas para mostrar ao usuário que
																			// o aluno número 1 está sendo perguntado

			notaAluno[contador] = inPut.nextFloat(); // aqui estou atribuindo valor a minha lista já que minha
														// repetição é baseada nisso
		}
		System.out.println("A segunda nota foi " + notaAluno[1]); // aqui mostro o segundo valor do meu vetor
																	// (começamos a conta do "0" por isso é colocado "1"

		float sum = 0; // criei uma váriavel para fazer a fórmula da média

		for (byte contador = 0; contador < notaAluno.length; contador++) { // meu for vai ter a repetição do tamanho do
																			// meu vetor novamente mas agora com os
																			// valores guardados da nota do aluno

			System.out.println(notaAluno[contador]); // aqui apenas mostra as notas do aluno em sequência

			sum = sum + notaAluno[contador]; // soma das notas do aluno
		}
		System.out.println("soma = " + sum); // imprimindo a soma das notas do aluno

		System.out.println("média = " + sum / notaAluno.length); // mostrando a média final do aluno
	}

}
