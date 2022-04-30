package br.com.Entra21.FahrenheitCelsius;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Faça um programa que converta graus Fahrenheit em Celsius.");
	    
	    System.out.println("Fórmula para converter é F=c.1,8+32");

	    System.out.println();
	    
	    float celsius, fahrenheit;

	    Scanner inPut = new Scanner(System.in);

	    System.out.println("Qual a temperatura em graus Celsius (°C)?");
	    celsius = inPut.nextFloat();

	    fahrenheit = (celsius * 1.82f) + 32f;

	    System.out.println();

	    System.out.println("Sua temperatura em fahrenheit é: " + fahrenheit + ".");

	}

}
