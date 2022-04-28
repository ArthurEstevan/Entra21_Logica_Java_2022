package br.com.Entra21.variaveis;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main{

		public static void main(String[] args){
		
		//VARIAVEIS PRIMITIVAS
		short ano = 2022;

		short anoPassado = 2021;

		int municipios = 5578;

		long habitantesTerra1990 = 790000000;

		double habitantesAtualmente = 7900000000.00;

		float peso = 70f, altura = 1.82f;

		char letra = 'R';

		boolean intervaloAntesdasoito = false;
		boolean intervaloAgora = true;

		//VARIAVEL NÃO PRIMITIVA
		String nomeCompleto = "Arthur Estevan Vargas";
		
		// --------------------------------------//

		//USANDO CLASSE SCANNER
		
		String nome; byte idade; float minhaAltura, salario;
		  
		Scanner inPut = new Scanner(System.in);
		  
		System.out.println("Qual seu nome?"); nome = inPut.nextLine();  //USANDO "inPut.nextline" CONSEGUE ESCREVER NOME COMPOSTO.
		  
		System.out.println();
		  
		System.out.println("Qual é sua idade?"); idade = inPut.nextByte(); 
		  
		System.out.println();
		  
		System.out.println("Qual altura?"); minhaAltura = inPut.nextFloat();
		  
		System.out.println();
		  
		System.out.println("Qual é seu sálario?"); salario = inPut.nextFloat();
		  
		System.out.println();
		  
		System.out.println("Bem vindo " + nome + " agora posso usar seus dados para cadastro");
		  
		//USO DO JOptionPane
		  
		/*nome=JOptionPane.showInputDialog("informe seu nome novamente:"); //Usado para criar uma caixa de diálogo
		  
		JOptionPane.showMessageDialog(null, "Legal agora eu aprendi seu nome." + nome); 
		  
		idade = Byte.parseByte(JOptionPane.showInputDialog("Informe sua idade novamente:"));
		  
		JOptionPane.showMessageDialog(null, "Legal agora aprendi sua idade." + idade);
		  
		salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu sálario novamente:"));
		  
		JOptionPane.showMessageDialog(null, "Legal agora eu aprendi seu sálario." + salario);*/	 
	}

}
