package br.com.Entra21.MediaAritmetica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Fa�a um programa que calcule a m�dia aritm�tica de um aluno.");

	    System.out.println("Capture o nome do aluno e valor das tr�s notas para informar a m�dia, formula da m�dia � a soma das notas, dividido pela quantidade de notas.");

	    float notas, media, notaUm, notaDois, notaTres, semestre;
	    String nome;
	    byte trabalho=1, prova=1, redacao=1;

	    Scanner inPut = new Scanner(System.in);

	    System.out.println();
	    
	    System.out.println("Qual seu nome?");
	    nome = inPut.nextLine();

	    System.out.println();

	    System.out.println("Qual sua nota na Prova de Portugu�s?");
	    notaUm = inPut.nextFloat();

	    System.out.println();

	    System.out.println("Qual sua nota no Trabalho de Portugu�s?");
	    notaDois = inPut.nextFloat();

	    System.out.println();

	    System.out.println("Qual sua nota na Reda��o de Portugu�s?");
	    notaTres = inPut.nextFloat();

	    System.out.println();

	    semestre = trabalho + prova + redacao;
	    notas = notaUm + notaDois + notaTres;
	    media = notas / semestre;
	    
	    System.out.println( nome +" sua m�dia final no semestre em Portugu�s � " +media);
	}

}
