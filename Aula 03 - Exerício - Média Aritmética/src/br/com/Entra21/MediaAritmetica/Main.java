package br.com.Entra21.MediaAritmetica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Faça um programa que calcule a média aritmética de um aluno.");

	    System.out.println("Capture o nome do aluno e valor das três notas para informar a média, formula da média é a soma das notas, dividido pela quantidade de notas.");

	    float notas, media, notaUm, notaDois, notaTres, semestre;
	    String nome;
	    byte trabalho=1, prova=1, redacao=1;

	    Scanner inPut = new Scanner(System.in);

	    System.out.println();
	    
	    System.out.println("Qual seu nome?");
	    nome = inPut.nextLine();

	    System.out.println();

	    System.out.println("Qual sua nota na Prova de Português?");
	    notaUm = inPut.nextFloat();

	    System.out.println();

	    System.out.println("Qual sua nota no Trabalho de Português?");
	    notaDois = inPut.nextFloat();

	    System.out.println();

	    System.out.println("Qual sua nota na Redação de Português?");
	    notaTres = inPut.nextFloat();

	    System.out.println();

	    semestre = trabalho + prova + redacao;
	    notas = notaUm + notaDois + notaTres;
	    media = notas / semestre;
	    
	    System.out.println( nome +" sua média final no semestre em Português é " +media);
	}

}
