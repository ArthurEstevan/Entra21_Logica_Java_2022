package br.com.Entra21.AlturaMinimaBrinquedo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Defina como constante a altura minima permitida para entrar em um brinquedo "
				+ "(Aten��o a nomenclatura e utilize a constante no IF)");
		
		System.out.println("Capture nome e altura do usu�rio");
		System.out.println("Validar se a altura informada � MENOR que a permitida");
		System.out.println("Caso seja MENOR informar de forma educada mencionando o nome do usu�rio e sua altura qual o "
				+ "par�metro minimo para entrar no brinquedo");
		System.out.println("Caso n�o seja MENOR informar que a entrada est� liberada.");
		
		Scanner inPut = new Scanner(System.in);
		
		String nome;
		final float altura = 1.8f;
		
		float alturaUsuario;
		
		System.out.println();
		System.out.println("Qual nome do usu�rio?");
		nome = inPut.nextLine();
		System.out.println();
		System.out.println("Qual sua altura?");
		alturaUsuario = inPut.nextFloat();
		System.out.println();
		
		if (alturaUsuario >= altura) {
			System.out.println(nome+ " pode se divertir no brinquedo, bom proveito.");
		} else {
			System.out.println(nome+ " voc� felizmente n�o pode se divertir hoje, tente daqui alguns anos, desculpa amiguinho.");
		}
	}
}
