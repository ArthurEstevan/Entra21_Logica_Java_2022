package br.com.Entra21.elseif;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Aprendendo sobre Else_If");
		
		
		float altura = 1.7f;
		double dinheiro = 3000f;
		byte pontos;
		String mensagem;
		
		if(altura<1.5f) {
			System.out.println("� bem baixinho");
		}else if(altura<1.9f) { //� alto
			System.out.println("� alto");
		}else {
			//MESMO QUE N�O TENHA NADA AQUI � BOM COLOCAR ELSE PARA BOA PR�TICA
		}
		
			//SE � AT� 1200, AT� 1800, AT� 2000, QUALQUER VALOR
		if(dinheiro <=1200f) {
			System.out.println("S�lario m�nimo");
			pontos = 5;
		}else if(dinheiro <=1800) {
				System.out.println("Ta ficando rico");
			pontos = 8;
		}else if(dinheiro <=2000) {
			System.out.println("Abre um n�gocio");
			pontos = 12;
		}else {
			System.out.println("Me contrata");
			pontos = 13;
		}

		
		System.out.println("sua pontua��o " +pontos);
		
		//SE � AT� 1200, AT� 1800, AT� 2000, QUALQUER VALOR
	if(dinheiro <=1200f) {
		mensagem = "S�lario m�nimo";
		pontos = 5;
	}else if(dinheiro <=1800) {
		mensagem = "Ta ficando rico";
		pontos = 8;
	}else if(dinheiro <=2000) {
		mensagem = "Abre um n�gocio";
		pontos = 12;
	}else {
		mensagem = "Me contrata";
		pontos = 13;
	}

	
	System.out.println("sua pontua��o " +pontos);
	}

}
