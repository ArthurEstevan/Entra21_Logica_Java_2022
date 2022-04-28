package br.com.Entra21.variaveis;

import java.io.InputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

		
		  String nome; byte idade; float minhaAltura, salario;
		  
		  Scanner inPut = Scanner(System.in);
		  
		  System.out.println("Por favor qual seu nome?"); nome = inPut.nextLine();  //Usando inPut.nextline consegue escrever nomes composto
		  
		  System.out.println("Qual é sua idade?"); idade = inPut.nextByte(); 
		  
		  System.out.println("Qual altura?"); minhaAltura = inPut.nextFloat();
		  
		  System.out.println("Qual é seu sálario"); salario = inPut.nextFloat();
		  
		  System.out.println("Bem vindo " + nome +
		  " agora posso usar seus dados para cadastro");
		  
		  
		 nome=JOptionPane.showInputDialog("informe novamente seu nome completo"); //Usado para criar uma caixa de diálogo
		  
		  JOptionPane.showMessageDialog(null, "legal agora eu aprendi seu nome" +nome); 
		  
		  idade = Byte.parseByte(JOptionPane.showInputDialog("Sua idaide?"));
		  
		  JOptionPane.showMessageDialog(null, "legal agora eu sei qual é sua "+idade);
		  
		  salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salario?"));
		  
		 JOptionPane.showMessageDialog(null,
		  "legal agora eu seu qual é seu salario "+salario);
		 

	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
