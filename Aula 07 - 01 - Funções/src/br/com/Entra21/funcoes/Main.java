package br.com.Entra21.funcoes;

import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Aprendendo Função");
		
		Scanner inPut = new Scanner(System.in);
		
		String opcao;
		
		System.out.println("Quero executar o assunto abaixo");
		System.out.println("1 - Procedimento");
		System.out.println("2 - Parâmetros");
		System.out.println("3 - Retorno");
		System.out.println("4 - Completo");
		System.out.println("11 - Exercício01");
		System.out.println("12 - Exercício02");
		System.out.println();
		opcao = inPut.nextLine();
		System.out.println();
		
		
		switch (opcao.toLowerCase()) {
		
		case "1":
		case "procedimento":
			verProcedimento();
			break;
			
		case "2":
		case "parâmetro": 	
			verParametro(2); 	
			break;
			
		case "3":
		case "retornos":
			byte retornou = retorno();
			System.out.println("Esse método retornou " +retorno());
			break;
			
		case "4":
		case "completa":
			calcularDivisao(0,0); //retorno não precisa ser usado
			
			float entradaA, entradaB;
			
			System.out.println("Informe o primeiro float");
			entradaA = inPut.nextFloat();
			System.out.println();
			
			System.out.println("Informe o primeiro float");
			entradaB = inPut.nextFloat();
			System.out.println();
			
			float calculo = calcularDivisao(entradaA, entradaB);
			
			System.out.println("Resultou nesse calculo " +calculo);
			break;

		default:
			System.out.println("Não tem essa opção.");
			
		}
		
	}
	
	public static void capturarfrase() {
		System.out.println("Escreve uma frase...");
		System.out.println("----------------------------");
		System.out.println("-         ENTER            -");
		System.out.println("----------------------------");
	}
	
	public static void verProcedimento( ) {
		
		System.out.println("1 - Procedimento");
		
		Scanner inPut = new Scanner(System.in);
		String frase;
		
		capturarfrase();
		frase = inPut.nextLine();
		
		System.out.println("você disse " +frase);
	}
	
	public static void verParametro (int numero) {
		System.out.println("Voce me passou por parâmetro o número " +numero);
		if(numero % 2 ==0) {
			System.out.println("Que legal o número ainda é par");
		}
		
	}

	public static byte retorno() {
		byte retorno = 25;
		return retorno;
	}

	public static float calcularDivisao(float numeroA, float numeroB) {
		return numeroA / numeroB;
	}

}

