package br.com.Entra21.OperadoresLogicos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operadores Lógicos");
		System.out.println();
		
		System.out.println("&& = expressão restritiva");

		byte idade = 18;
		float altura = 1.82f;
		double dinheiro;
		boolean resultado;
		
		resultado = idade<18;
		
		resultado = altura>2.0f; 
		
		resultado = (idade <= 18) && (altura >= 2.0f); //true

		idade = 15;
		altura = 1.9f;
		
		resultado = (idade < 18) && (altura >= 2.0f); //false
		
		idade = 20;
		altura = 2.10f;
		dinheiro = 20000;
		
		resultado = (idade >= 18) && (altura >= 2.0f) && (dinheiro >= 50000); //false
		
		idade = 30;
		altura = 2.15f;
		dinheiro = 100000;
		
		resultado = (idade <= 18) && (altura >= 2.0f) && (dinheiro >= 50000); //false
				
		idade = 40;
		altura = 2.35f;
		dinheiro = 100000;
		
		resultado = ( (idade >= 18)  &&  (idade <= 40) ) && (altura < 2.35) && (dinheiro > 50000); //true
		
		System.out.println();
		System.out.println("|| = expressão inclusiva");
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade > 19) || (dinheiro >= 1000); //true

		
		resultado = (idade <= 14) || (idade >= 18); //false

		idade = 3;
		
		resultado = (idade <= 14) || (idade >= 18); //true

	}

}
