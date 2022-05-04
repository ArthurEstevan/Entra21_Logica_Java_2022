package br.com.Entra21.AlturaMinimaBrinquedo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Defina como constante a altura minima permitida para entrar em um brinquedo "
				+ "(Atenção a nomenclatura e utilize a constante no IF)");
		
		System.out.println("Capture nome e altura do usuário");
		System.out.println("Validar se a altura informada é MENOR que a permitida");
		System.out.println("Caso seja MENOR informar de forma educada mencionando o nome do usuário e sua altura qual o "
				+ "parâmetro minimo para entrar no brinquedo");
		System.out.println("Caso não seja MENOR informar que a entrada está liberada.");
		
		Scanner inPut = new Scanner(System.in);
		
		String nome;
		final float altura = 1.8f;
		
		float alturaUsuario;
		
		System.out.println();
		System.out.println("Qual nome do usuário?");
		nome = inPut.nextLine();
		System.out.println();
		System.out.println("Qual sua altura?");
		alturaUsuario = inPut.nextFloat();
		System.out.println();
		
		if (alturaUsuario >= altura) {
			System.out.println(nome+ " pode se divertir no brinquedo, bom proveito.");
		} else {
			System.out.println(nome+ " você felizmente não pode se divertir hoje, tente daqui alguns anos, desculpa amiguinho.");
		}
	}
}
