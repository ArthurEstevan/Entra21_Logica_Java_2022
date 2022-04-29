package br.com.Entra21.operadorternario_src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operador Ternario");
		System.out.println();
		
		String nome;
		
		boolean condicao=true;
		
		nome = (true)?"Nome":"Sobrenome";
		
		System.out.println("Então você é " +(condicao? "de maior" : "de menor") );
		
		byte idade= 15;
		
		if (idade>17) {
			System.out.println("você é de maior?");
		}else {											//TORNA GRANDE ALGO QUE PODE SER PEQUENO
			System.out.println("você é de menor?");
		}
		
		System.out.println("Você é de maior? " + (idade>17? "de maior": "de menor") );
		
		
	}

}
