package br.com.Entra21.Signo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Crie um programa que informe o signo do usu�rio:");
		System.out.println();
		System.out.println("� Capturar nome, dia e m�s do anivers�rio.\r\n"
				+ "� Criar uma constante para n�mero limite de dia do m�s, no caso 31 dias.\r\n" + "� Se: ");
		System.out.println("	- O dia for maior que o limite, informar o limite de dias no m�s;\r\n"
				+ "	- Se o m�s for invalido informar os meses v�lidos;\r\n"
				+ "	- Se no m�s n�o existir o dia informe ao usu�rio.");
		System.out.println();
		System.out.println(
				"� Sen�o:\r\n" + "	- Escolher o m�s correspondente para fazer as valida��es especificas;\r\n"
						+ "	- Com base no m�s informe o signo.");
		System.out.println();

		Scanner inPut = new Scanner(System.in);

		String opcao;
		
		System.out.println("----------------------------------------------------");
		System.out.println("-                   Informe A��o                   -");
		System.out.println("----------------------------------------------------");

		System.out.println("1 - Signo");		
		opcao = inPut.next();					
		System.out.println();
		
		switch (opcao.toLowerCase()) {

		case "1":
		case "signo":
			Signo();
			break;
		}
		System.out.println();

	}

	public static void Signo() {

		Scanner inPut = new Scanner(System.in);

		String nome;
		Byte dia, mes;

		System.out.println("What is your name?");
		nome = inPut.nextLine();
		System.out.println();

		System.out.println("What day is your birthday?");
		dia = inPut.nextByte();

		System.out.println();
		System.out.println("What mounth is your birtday");
		mes = inPut.nextByte();

		switch (mes) {

		case 1:
			if (mes == 1 && dia >= 21 && (dia <= 31) || mes == 2 && dia <= 18) {
				System.out.println(nome+ " seu signo � Aqu�rio: de 21 de janeiro a 18 de fevereiro;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 2:
			if ((mes == 2 && dia >= 19) && (dia <= 28) || (mes == 3 && dia <= 20)) {
				System.out.println(nome+ " seu signo � Peixes: de 19 de fevereiro a 20 de mar�o;");
			} else if (mes == 2 && dia > 28) {
				System.out.println("Data informado n�o consta no calend�rio");
			}
			break;

		case 3:
			if (mes == 3 && dia >= 21 && (dia <= 31) || mes == 4 && dia <= 20) {
				System.out.println(nome+ " seu signo � �ries: de 21 de mar�o a 20 de abril;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 4:
			if ((mes == 4 && dia >= 21) && (dia <= 30) || (mes == 5 && dia <= 20)) {
				System.out.println(nome+ " seu signo � Touro: de 21 de abril a 20 de maio;");
			} else {
				System.out.println("Data informada n�o costa no calend�rio");
			}
			break;

		case 5:
			if ((mes == 5 && dia >= 21) && (dia <= 31) || (mes == 6 && dia <= 20)) {
				System.out.println(nome+ " seu signo � G�meos: de 21 de maio a 20 de junho;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 6:
			if ((mes == 6 && dia >= 21) && (dia <= 30) || (mes == 7 && dia <= 22)) {
				System.out.println("C�ncer: de 21 de junho a 22 de julho;");
			} else {
				System.out.println(nome+ " seu signo � Data informada n�o costa no calend�rio");
			}
			break;

		case 7:
			if ((mes == 7 && dia >= 23) && (dia <= 31) || (mes == 8 && dia <= 22)) {
				System.out.println(nome+ " seu signo � Le�o: de 23 de julho a 22 de agosto;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 8:
			if ((mes == 8 && dia >= 23) && (dia <= 31) || (mes == 9 && dia <= 22)) {
				System.out.println(nome+ " seu signo � Virgem: de 23 de agosto a 22 de setembro;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 9:
			if ((mes == 9 && dia > 23) && (dia <= 30) || (mes == 10 && dia <= 22)) {
				System.out.println(nome+ " seu signo � Libra: de 23 de setembro a 22 de outubro;");
			} else {
				System.out.println("Data informada n�o costa no calend�rio");
			}
			break;

		case 10:
			if ((mes == 10 && dia >= 23) && (dia <= 31) || (mes == 11 && dia <= 21)) {
				System.out.println(nome+ " seu signo � Escorpi�o: de 23 de outubro a 21 de novembro;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 11:
			if ((mes == 11 && dia >= 22) && (dia <= 30) || (mes == 12 && dia <= 21)) {
				System.out.println(nome+ " seu signo � Sagit�rio: de 22 de novembro a 21 de dezembro;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		case 12:
			if ((mes == 12 && dia >= 22) && (dia <= 31) || (mes == 1 && dia <= 20)) {
				System.out.println(nome+ " seu signo � Capric�rnio: de 22 de dezembro a 20 de janeiro;");
			} else {
				System.out.println("Data informada n�o consta no calend�rio");
			}
			break;

		default:
			System.out.println("M�s Invalido:\r\n" + "1 - Janeiro\r\n" + "2 - Fevereiro\r\n" + "3 - Mar�o\r\n"
					+ "4 - Abril\r\n" + "5 - Maio\r\n" + "6 - Junho\r\n" + "7 - Julho\r\n" + "8 - Agosto\r\n"
					+ "9 - Setembro\r\n" + "10 - Outurbo\r\n" + "11 - Novembro\r\n" + "12 - Dezembro");
			break;
		}

	}

}
