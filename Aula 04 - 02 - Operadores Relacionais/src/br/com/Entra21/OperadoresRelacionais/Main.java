package br.com.Entra21.OperadoresRelacionais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operadores Relacionais");
		System.out.println();
		
		byte idadeA= 50, idadeB= 50;
		boolean resultado;
		
		resultado = idadeA < idadeB;
		
		System.out.println("Idade A � menor que idade B? " +resultado);
		System.out.println("Idade A � maior que idade B? " + (idadeA > idadeB) );
		System.out.println("Idade A � menor ou igual que idade B? " + (idadeA <= idadeB) );
		System.out.println("Idade A � maior ou igual que idade B? " + (idadeA >= idadeB) );
		

	}

}
