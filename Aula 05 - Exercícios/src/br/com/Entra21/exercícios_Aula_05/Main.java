package br.com.Entra21.exercícios_Aula_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Capture dois número e veja qual é o maior");
		System.out.println();
		
		byte numeroA, numeroB;
		
		Scanner inPut = new Scanner(System.in);
		
		System.out.println("Informe o valor do número A");
		numeroA = inPut.nextByte();
				
		System.out.println("Informe o valor do número B");
		numeroB = inPut.nextByte();
		
		System.out.println();
		
		if (numeroA > numeroB) {
			System.out.println("Número A é maior que B");
		}else if(numeroA == numeroB) {
			System.out.println("São iguai");
		}else {
			System.out.println("Número B é maior que A");
		}
		
		
		System.out.println();
		System.out.println("Capture a data de nascimento e veja se pode votar");
		System.out.println();
		
		short anoNascimento, calculo;
		
		
		System.out.println("Que ano você nasceu?");
		anoNascimento = inPut.nextShort();
		
		calculo = (short) (2022-anoNascimento);
		
		System.out.println();
		if (calculo>=15) {
			System.out.println("Tem idade pra votar");
		}else {
			System.out.println("Não tem idade pra votar");
		}
		
		System.out.println();
		System.out.println(calculo>=16? "Tem idade pra votar": "Não tem idade pra votar");	
	}

}
