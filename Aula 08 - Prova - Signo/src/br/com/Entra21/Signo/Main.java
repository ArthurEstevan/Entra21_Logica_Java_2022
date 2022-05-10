package br.com.Entra21.Signo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Crie um programa que informe o signo do usuário
		// Capturar nome, dia e mês de aniversário;
		// Criar constante para numero limite do dia do mês, no caso 31;

		// Se:
		// o dia for maior que o limite;
		// Informar o valor limite para um dia do mês;

		// Senão:
		// escolher o mês correspondente para fazer as validações especificas;
		// nesse mês existe esse dia?
		// com base no dia do mês qual o signo;
		// mês invalido.

		startSystem();//Iniciar a funcao para capturar os dados do usuario. (Conceito de recursividade para implementar loops)
	}
	
	//----------- INICIO SISTEMA  --------------//
	public static void startSystem() {

		String fullNameUser = nameUser();			// Executa uma funcao para capturar o nome (conceito de recursividade para implementar loops)
		captureDate(fullNameUser);					// Executa uma funcao para capturar o dia e mes de aniversário do usuário. (conceito de recursividade para implementar loops)
	}

	//----------- CAPTURANDO NOME USUARIO --------------//
	public static String nameUser() {

		Scanner inPut = new Scanner(System.in);											//Atribuindo a Class Scanner a variavel input

		String firstNameUser, lastNameUser;												//definindo a variavel que vai receber o nome do usuário
    
    System.out.println();
		System.out.println("Hello!\n\nWhat is your first name?");							//Perguntando o primeiro nome do usuario.
		firstNameUser = inPut.next();													//Capturando o primeiro nome usuario

		System.out.println("And what is your last name?");								//Perguntando o sobrenome do usuario.
		lastNameUser = inPut.next();													//Capturando o sobrenome usuario

		String firstLetterName = firstNameUser.substring(0, 1).toUpperCase();			//Pegar a primeira letra do nome informado e colocando em maiuscula
		firstNameUser = firstLetterName + firstNameUser.substring(1).toLowerCase();		//Concatenando a primeira letra do nome informado, com as demais letras do nome, removendo a primeira letra da string firstName

		String finaltLetterName = lastNameUser.substring(0, 1).toUpperCase();			//Pegar a primeira letra do sobrenome informado e colocando em maiuscula
		lastNameUser = finaltLetterName + lastNameUser.substring(1).toLowerCase();		//Concatenando a primeira letra do sobrenome informado, com as demais letras do nome, removendo a primeira letra da string lastName

		String fullNameUser = firstNameUser + " " + lastNameUser;						//Concatenando o nome completo
		return fullNameUser;															//Retornar nome completo

	}

	//----------- CAPTURANDO ANIVERSARIO/MES USUARIO --------------//
	public static void captureDate(String fullNameUser) {
		Scanner inPut = new Scanner(System.in);									//Atribuindo a Class Scanner a variavel input
										
		String monthBirthday;													//Definindo a variavel que vai receber o mes do aniversario	
		byte dayBirthday;														//Definindo a variavel que vai receber o dia do aniversario

		System.out.println(fullNameUser + " what day is your Birthday?");
		dayBirthday = inPut.nextByte();											//Capturando a informacao

		System.out.println();
		System.out.println("\tSELECT YOUR BIRTHDAY MONTH TOO");
		System.out.println("================================================");
		System.out.println("| 01 - January   | 05 - May    | 09 - September|");
		System.out.println("| 02 - February  | 06 - June   | 10 - October  |");
		System.out.println("| 03 - March     | 07 - July   | 11 - November |");
		System.out.println("| 04 - April     | 08 - August | 12 - December |");
		System.out.println("================================================");
		monthBirthday = inPut.next();											//Perguntando o mes em que ele nasceu.

		switch (monthBirthday.toLowerCase()) {
		case "1", "january":
			//trazer a verificacao do mes janeiro
			validationThirtyOne(dayBirthday, fullNameUser, 1); 					//funcao do tipo void que recebe o numero de dias maximos daquele mes, nome do usuário e o número do mês
			break;

		case "2", "february":
			//trazer a verificacao do mes fevereiro
			validationTwentyEight(dayBirthday, fullNameUser, 2);
			break;

		case "3", "march":
			//trazer a verificacao do mes março
			validationThirtyOne(dayBirthday, fullNameUser, 3);
			break;

		case "4", "april":
			//trazer a verificacao do mes abril
			validationThirty(dayBirthday, fullNameUser, 4);
			break;

		case "5", "may":
			//trazer a verificacao do mes maio
			validationThirtyOne(dayBirthday, fullNameUser, 5);
			break;

		case "6", "june":
			//trazer a verificacao do mes junho
			validationThirty(dayBirthday, fullNameUser, 6);
			break;

		case "7", "july":
			//trazer a verificacao do mes julho
			validationThirtyOne(dayBirthday, fullNameUser, 7);
			break;

		case "8", "august":
			//trazer a verificacao do mes agosto
			validationThirtyOne(dayBirthday, fullNameUser, 8);
			break;

		case "9", "september":
			//trazer a verificacao do mes setembro
			validationThirty(dayBirthday, fullNameUser, 9);
			break;

		case "10", "october":
			//trazer a verificacao do mes outubro
			validationThirtyOne(dayBirthday, fullNameUser, 10);
			break;

		case "11", "november":
			//trazer a verificacao do mes novembro
			validationThirty(dayBirthday, fullNameUser, 11);
			break;

		case "12", "december":
			//trazer a verificacao do mes dezembro
			validationThirtyOne(dayBirthday, fullNameUser, 12);
			break;

		default:
			System.out.println("Please, enter value valid for the day and of the month"); //se informar um mês errado ele volta para o inicio da função
			captureDate(fullNameUser);
			break;
		}

	}

	//----------- VALIDAÇÃO PARA MESES COM 30 DIAS --------------//
	public static void validationThirty(byte dayBirthday, String nameUser, int monthBirthday) {				//Função que recebe o dia do aniversario, mês do aniversário e nome do usuario

		final byte DAYLIMIT = 30;

		if (dayBirthday > 30) {
			System.out.println("Please, enter valid value for the day of the month");						//Texto para número do mês inválido.
			captureDate(nameUser);																			//Reinicia a captura de dados da data.
		} else {
			verifyZodiacSign(dayBirthday, nameUser, monthBirthday);											//Iniciar função para verificar qual o signo da pessoa.
		}
	}

	//----------- VALIDAÇÃO PARA MESES COM 28 DIAS --------------//
	public static void validationTwentyEight(byte dayBirthday, String nameUser, int monthBirthday) {
		//Função que recebe o dia do aniversario, mês do aniversáro e nome do usuário

		final byte DAYLIMIT = 28;

		if (dayBirthday > 28) {
			System.out.println("Please, enter valid value for the day of the month");						//Texto para número do mês inválido.
			captureDate(nameUser);																			//Reinicia a captura de dados da data.
		} else {
			verifyZodiacSign(dayBirthday, nameUser, monthBirthday);											//Iniciar função para verificar qual o signo da pessoa.
		}
	}

	//----------- VALIDAÇÃO PARA MESES COM 31 DIAS --------------//
	public static void validationThirtyOne(byte dayBirthday, String nameUser, int monthBirthday) {			//Função que recebe o dia do aniversario, mês do aniversário e nome do usuario

		final byte DAYLIMIT = 31;

		if (dayBirthday > 31) {
			System.out.println("Please, enter valid value for the day of the month");						//Texto para número do mês inválido.
			captureDate(nameUser);																			//Reinicia a captura de dados da data.
		} else {
			verifyZodiacSign(dayBirthday, nameUser, monthBirthday);											//Iniciar função para verificar qual o signo da pessoa.
		}
	}

	//----------- VERIFICANDO O SIGNO DO USUARIO --------------//
	private static void verifyZodiacSign(byte dayBirthday, String nameUser, int monthBirthday) {			

		if (monthBirthday == 3 && dayBirthday >= 21 || monthBirthday == 4 && dayBirthday <= 20) {
			System.out.println(nameUser + " your Zodiac Sign is Aries");
		} else if (monthBirthday == 4 && dayBirthday >= 21 || monthBirthday == 5 && dayBirthday <= 20) {
			System.out.println(nameUser + " your Zodiac Sign is Taurus");
		} else if (monthBirthday == 5 && dayBirthday >= 21 || monthBirthday == 6 && dayBirthday <= 20) {
			System.out.println(nameUser + " your Zodiac Sign is Gemini");
		} else if (monthBirthday == 6 && dayBirthday >= 21 || monthBirthday == 7 && dayBirthday <= 21) {
			System.out.println(nameUser + " your Zodiac Sign is Cancer");
		} else if (monthBirthday == 7 && dayBirthday >= 22 || monthBirthday == 8 && dayBirthday <= 22) {
			System.out.println(nameUser + " your Zodiac Sign is Leo");
		} else if (monthBirthday == 8 && dayBirthday >= 23 || monthBirthday == 9 && dayBirthday <= 22) {
			System.out.println(nameUser + " your Zodiac Sign is Virgo");
		} else if (monthBirthday == 9 && dayBirthday >= 23 || monthBirthday == 10 && dayBirthday <= 22) {
			System.out.println(nameUser + " your Zodiac Sign is Libra");
		} else if (monthBirthday == 10 && dayBirthday >= 23 || monthBirthday == 11 && dayBirthday <= 21) {
			System.out.println(nameUser + " your Zodiac Sign is Scorpio");
		} else if (monthBirthday == 11 && dayBirthday >= 22 || monthBirthday == 12 && dayBirthday <= 21) {
			System.out.println(nameUser + " your Zodiac Sign is Sagittarius");
		} else if (monthBirthday == 12 && dayBirthday >= 22 || monthBirthday == 1 && dayBirthday <= 20) {
			System.out.println(nameUser + " your Zodiac Sign is Capricorn");
		} else if (monthBirthday == 1 && dayBirthday >= 21 || monthBirthday == 2 && dayBirthday <= 19) {
			System.out.println(nameUser + " your Zodiac Sign is Aquarius");
		} else if (monthBirthday == 2 && dayBirthday >= 20 || monthBirthday == 3 && dayBirthday <= 20) {
			System.out.println(nameUser + " your Zodiac Sign is Pisces");
		} else {
			System.out.println(nameUser + " -YOU IS A GOD-");
		}
	}

}
