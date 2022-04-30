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
			System.out.println("é bem baixinho");
		}else if(altura<1.9f) { //é alto
			System.out.println("é alto");
		}else {
			//MESMO QUE NÃO TENHA NADA AQUI É BOM COLOCAR ELSE PARA BOA PRÁTICA
		}
		
			//SE É ATÉ 1200, ATÉ 1800, ATÉ 2000, QUALQUER VALOR
		if(dinheiro <=1200f) {
			System.out.println("Sálario mínimo");
			pontos = 5;
		}else if(dinheiro <=1800) {
				System.out.println("Ta ficando rico");
			pontos = 8;
		}else if(dinheiro <=2000) {
			System.out.println("Abre um négocio");
			pontos = 12;
		}else {
			System.out.println("Me contrata");
			pontos = 13;
		}

		
		System.out.println("sua pontuação " +pontos);
		
		//SE É ATÉ 1200, ATÉ 1800, ATÉ 2000, QUALQUER VALOR
	if(dinheiro <=1200f) {
		mensagem = "Sálario mínimo";
		pontos = 5;
	}else if(dinheiro <=1800) {
		mensagem = "Ta ficando rico";
		pontos = 8;
	}else if(dinheiro <=2000) {
		mensagem = "Abre um négocio";
		pontos = 12;
	}else {
		mensagem = "Me contrata";
		pontos = 13;
	}

	
	System.out.println("sua pontuação " +pontos);
	}

}
