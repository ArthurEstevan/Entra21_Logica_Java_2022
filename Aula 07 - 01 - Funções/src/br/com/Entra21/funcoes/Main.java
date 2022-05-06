package br.com.Entra21.funcoes;

import java.util.Scanner;

import javax.lang.model.element.VariableElement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Aprendendo Fun��o");
		
		Scanner inPut = new Scanner(System.in);
		
		String opcao;
		
		System.out.println("Quero executar o assunto abaixo");
		System.out.println("1 - Procedimento");
		System.out.println("2 - Par�metros");
		System.out.println("3 - Retorno");
		System.out.println("4 - Completo");
		System.out.println("11 - Exerc�cio01");
		System.out.println("12 - Exerc�cio02");
		System.out.println();
		opcao = inPut.nextLine();
		System.out.println();
		
		
		switch (opcao.toLowerCase()) {
		
		case "1":
		case "procedimento":
			verProcedimento();
			break;
			
		case "2":
		case "par�metro": 	
			verParametro(2); 	
			break;
			
		case "3":
		case "retornos":
			byte retornou = retorno();
			System.out.println("Esse m�todo retornou " +retorno());
			break;
			
		case "4":
		case "completa":
			calcularDivisao(0,0); //retorno n�o precisa ser usado
			
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
			System.out.println("N�o tem essa op��o.");
			
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
		
		System.out.println("voc� disse " +frase);
	}
	
	public static void verParametro (int numero) {
		System.out.println("Voce me passou por par�metro o n�mero " +numero);
		if(numero % 2 ==0) {
			System.out.println("Que legal o n�mero ainda � par");
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

