package br.com.Entra21.operadorternario_src;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operador Ternario");
		System.out.println();
		
		String nome;
		
		boolean condicao=true;
		
		nome = (true)?"Roberto":"Marcos";
		
		System.out.println("Qual seu " +nome);
		
		System.out.println("Então você é " +(condicao? "de maior" : "de menor") );
		
		byte idade= 15;
		
		System.out.println();
		System.out.println("Você é de maior? " + (idade>17? "de maior": "de menor") );
		
	}

}
