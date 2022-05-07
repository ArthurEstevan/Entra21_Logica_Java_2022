package br.com.entra21.for_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inPut = new Scanner(System.in);
		String opcao;
		System.out.println("Sobre o for escolha uma opção para aprender");

		System.out.println("1 - for simple;");
		System.out.println("2 - for inside for;");
		System.out.println("3 - Limit exercise");
		System.out.println("4 - Return multiplication table");
		System.out.println("5 - Full multiplication table");
		System.out.println("6 - Final exercise");
		opcao = inPut.nextLine();

		switch (opcao.toLowerCase()) {

		case "1", "for simple": // simple structure
			classForSimple(); // função do tipo procedimento não tem argumento nem retorno
			break;

		case "2", "for inside for": // complex structure
			classForIniseFor();
			break;

		case "3":
			limitExercise();
			break;

		case "4":
			tableExercise();
			break;

		case "5":
			completTable();
			break;
			
		case "6":
			finalExercise();
			break;
			
		}

	}

	private static void completTable() {
		
		Scanner inPut = new Scanner(System.in);
		
		int completTable;
		
		System.out.println("-Enter the number for multiplication table-\n");
		completTable = inPut.nextInt();											//determino até onde vai minha tabuada				
		
		for (int contador = 1; contador <= completTable; contador++) {			//escrevo minha tabuada
			System.out.println("Multiplication Table\n " +contador+ "-");
			
			for (int contadorIterno = 1; contadorIterno < 11; contadorIterno++) { 					//arrumo a escrita das contas
				System.out.println(contador+ " x " +contadorIterno+ "=" +(contador*contadorIterno));//faço as contas da minha tabuada
			}
			
			
		}
	}

	private static void tableExercise() {

		Scanner inPut = new Scanner(System.in);

		int tabuada;

		System.out.println("Enter the multiplication table number");
		tabuada = inPut.nextInt();

		for (int contador = 1; contador < 11; contador++) { // contador serve pra montar minha lista

			System.out.println("-YOUR MULTIPLICATION TABLE- ");
			System.out.println(+tabuada + " x " + contador + " = " + (tabuada * contador)); // esse parâmetro faz minha tabuada
																							
		}
	}

	public static void finalExercise() {

		Scanner inPut = new Scanner(System.in);

		byte numero;

		System.out.println("Qual número final?");
		numero = inPut.nextByte();
		System.out.println();

		for (int contador = numero; contador > 0; contador--) { //conta do número que informei até 1

			System.out.println("Sua Contagem " + contador);
		}

	}

	public static void limitExercise() {

		Scanner inPut = new Scanner(System.in);

		byte limite;

		System.out.println("Até qual número você quer contar?");
		limite = inPut.nextByte();
		System.out.println();

		for (int contador = 1; contador <= limite; contador++) { // conta até o número que deseja

			System.out.println("Sua contagem: " + contador);

		}

	}

	public static void classForIniseFor() {

		System.out.println("Aprendendo sobre for da maneira mais complexa");

		byte nivelMaior = 3, nivelDetalhe = 3;

		for (int contador = 1; contador <= nivelMaior; contador++) {

			System.out.println("Para o nivel maior repetindo pela " + contador + "ª vez");

			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				System.out.println("\tPara o nivel detalhe repetindo pela" + contadorInterno + "ª vezes");
			}
		}

	}

	public static void classForSimple() {
		System.out.println("Aprendendo sobre For");

		// contador 01
		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {

			System.out.println("Repetindo " + contador1);
			System.out.println("-------------");
		}

		// contador 02
		for (int contador = 1; contador <= 10; contador += 2) {

			System.out.println("Repetindo " + contador);
			// System.out.println("Repetindo " +contador1);
			// Esse syso só existe no outro escopo for
		}

		// contador 03
		for (int contador = 4; contador <= 10; contador += 2) {

			System.out.println("OBA " + contador);
		}

		for (int contador = 10; contador > 1; contador -= 1) {

			System.out.println("Resultado " + contador);

		}

		int tabuada = 3, contador = 1;

		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Tabuada " + contador + " x " + tabuada + " = " + (contador * tabuada));

		}

		System.out.println("Olha como o contador ficou " + contador);
	}

}
