package br.com.Entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte idade;
		idade = 18;

		byte outraidade = 18;

		short ano = 2022;

		short anopassado;

		anopassado = 2021;

		int municipios = 5578;

		int habitantesBrasil = 212060000;

		long habitantesterra1990;

		habitantesterra1990 = 790000000;

		double habitantesAtualmente = 790000000.00;

		float peso = 70f, altura = 1.82f;

		char letra = 'R';

		boolean intervaloAntesdasoito = false;
		boolean intervaloAgora = true;

		String nomeCompleto = "Arthur Estevan Vargas";
		
		//--------------------------------------//

		String nome;
		byte minhaIdade;
		float minhaAltura, salario;

		Scanner entrada;
		entrada = new Scanner(System.in);

		/*System.out.println("Por favor qual seu nome?");
		nome = entrada.nextLine();
		
		System.out.println("Está com pressa?");
		
		entrada.nextLine();
		
		System.out.println("Muita presa?");
		
		entrada.nextLine();
		
		System.out.println("Qual é sua idade?");
		minhaIdade = entrada.nextByte();
		
		System.out.println("Qual altura?");
		minhaAltura = entrada.nextFloat();
		
		System.out.println("Qual é seu sálario");
		salario = entrada.nextFloat();

		System.out.println("Bem vindo " + nome + " agora eu posso interagir com humanos");*/
		
		/*
		 * nome=JOptionPane.showInputDialog("informe novamente seu nome completo");
		 * 
		 * JOptionPane.showMessageDialog(null, "legal agora eu aprendi seu nome" +nome);
		 * 
		 * minhaIdade = Byte.parseByte(JOptionPane.showInputDialog("Sua idaide?"));
		 * 
		 * JOptionPane.showMessageDialog(null, "legal agora eu sei qual é sua "
		 * +minhaIdade);
		 */
		
		salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salario?"));
		
		JOptionPane.showMessageDialog(null, "legal agora eu seu qual é seu salario "+salario);

	}

}
