package br.com.Entra21.CelsiusFahrenheit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("Faça um programa que converta graus Celsius em Fahrenheit:");

	    System.out.println("Fórmula para converter é C=F-32/1,8.");

	    float celsius, fahrenheit;

	    Scanner inPut = new Scanner(System.in);

	    System.out.println();
	    System.out.println("Qual a temperatura em graus Fahrenheit (°F)?");
	    fahrenheit = inPut.nextFloat();

	    celsius = (fahrenheit - 32f) / 1.8f;

	    System.out.println();

	    System.out.println("Sua temperatura em celsius é " +celsius+ ".");

	}

}
