package br.com.Entra21.NotasAluno;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner inPut = new Scanner(System.in);
		float prova, redacao, trabalho, media;
		final byte notas = 3;
		String nome;

		System.out.println("Escreva um programa que:");
		System.out.println("Defina como constante a quantidade de notas de um aluno:");
		System.out.println();
		System.out.println("- Capture nome e cada uma das notas\r\n" + "- Calcule a média");
		System.out.println();
		System.out.println("Informe\r\n" + "se reprovou. (<3)\r\n" + "senao se, em recuperação. (<7)\r\n"
				+ "senão se, passou com a nota mínima. (=7)\r\n" + "senão se, passou mas poderia ser melhor. (<10)\r\n"
				+ "senão se, nota máxima. (=10)\r\n" + "senão (tem algo de errado com o seu calculo de média)");

		System.out.println();

		System.out.println("Qual seu nome? ");
		nome = inPut.nextLine();
		System.out.println();

		System.out.println("Qual sua nota na prova de Portugês? ");
		prova = inPut.nextFloat();
		System.out.println();

		if ((prova > 10) || (prova < 0)) {
			System.out.println("Informação Errada");
			System.exit(1);
		} else {
		}

		System.out.println("Qual sua nota na trabalho de Portugês? ");
		trabalho = inPut.nextFloat();
		System.out.println();

		if ((trabalho > 10) || (trabalho < 0)) {
			System.out.println("Informação Errada");
			System.exit(1);
		} else {
		}

		System.out.println("Qual sua nota na redacao de Portugês? ");
		redacao = inPut.nextFloat();
		System.out.println();

		if ((redacao > 10) || (redacao < 0)) {
			System.out.println("Informação Errada");
			System.exit(1);
		} else {
		}

		media = (prova + redacao + trabalho) / notas;

		System.out.println("Sua média foi " + media);
		System.out.println();

		if (media == 10f) {
			System.out.println(nome + " alcançou 10, parabéns!");
		} else if ((media <= 9f) || (media >= 8f)) {
			System.out.println(nome + " alcançou a média, porém, podia ser melhor.");
		} else if ((media == 7f) || (media > 7f)) {
			System.out.println(nome + " você atingiu a média mínima, tente melhorar!");
		}
		if ((media <= 6f) || (media < 7f)) {
			System.out.println(nome + " felizmente você reprovou.");
		} else {
		}
	}
}