package br.com.Entra21.exerc�cios_Aula_05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Capture dois n�mero e veja qual � o maior");
		System.out.println();
		
		byte numeroA, numeroB;
		
		Scanner inPut = new Scanner(System.in);
		
		System.out.println("Informe o valor do n�mero A:");
		numeroA = inPut.nextByte();
		System.out.println();
				
		System.out.println("Informe o valor do n�mero B:");
		numeroB = inPut.nextByte();
		
		System.out.println();
		
		if (numeroA > numeroB) {
			System.out.println("N�mero A � maior que B.");
		}else if(numeroA == numeroB) {
			System.out.println("S�o iguai.");
		}else {
			System.out.println("N�mero B � maior que A.");
		}
		
		
		System.out.println();
		System.out.println("Capture a data de nascimento e veja se pode votar");
		System.out.println();
		
		short anoNascimento, calculo;
		
		
		System.out.println("Que ano voc� nasceu?");
		anoNascimento = inPut.nextShort();
		
		calculo = (short) (2022-anoNascimento);
		
		System.out.println();
		if (calculo > 15) {
			System.out.println("Tem idade pra votar");
		}else {
			System.out.println("N�o tem idade pra votar");
		}
		
		System.out.println();
		System.out.println(calculo>=16? "Tem idade pra votar": "N�o tem idade pra votar");
		System.out.println();
		
		System.out.println("Capturar 3 notas do aluno para calcular a m�dia e informar se est� aprovado ou reprovado.");
		System.out.println();
		
	    float notas, media, notaUm, notaDois, notaTres, semestre;
	    String nome;
	    byte trabalho=1, prova=1, redacao=1;

		System.out.println("Qual nota da sua prova de portugu�s?");
		notaUm = inPut.nextFloat();
		System.out.println();
		System.out.println("Qual nota da sua redac�o de portugu�s?");
		notaDois = inPut.nextFloat();
		System.out.println();
		System.out.println("Qual nota do seu trabalho de portugu�s?");
		notaTres = inPut.nextFloat();
		
	    semestre = trabalho + prova + redacao;
	    
	    notas = notaUm + notaDois + notaTres;
	    
	    media = notas / semestre;
	    
		System.out.println();
		
	    if (media > 6f) {
	    	System.out.println("Aprovado");
	    	}else {
	    		System.out.println("Reprovado");
	    	}
	    
	    System.out.println();
	    System.out.println("Capturar peso e altura para calcular o IMC e exibir o resultado e em qual faixa de peso ");
	    System.out.println();
	    
	    float peso, altura, imc;
 
	    System.out.println("Qual sua altura?");
	    altura = inPut.nextFloat();
	    	
	    System.out.println("Qual seu peso?");
	    peso = inPut.nextFloat();
	    
	    imc = (altura*=2) / peso;
	    
	    System.out.println("Seu " +imc);
	    System.out.println();
	    
	    
	    
	    if( (imc >= 17f && imc <= 18.4f) ) {
	    	System.out.println("Abaixo do peso");
	    	
	    }else if (imc >= 18.5f && imc <= 24.9f) {
	    	System.out.println("Peso normal");
	    	
	    }else if (imc >= 25f && imc <= 29.9f) {
	    	System.out.println("Acima do peso");
	    	
	    }else {
	    	System.out.println("Obesidade Grau I");
	    }
	    
	    
	    
	    
	    

		
		
		
		
		
		
		
		
	}

}
