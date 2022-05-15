package br.com.entra21.exerviserepeticao;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		startSystem();

	}

	// --------START SYSTEM--------//
	public static void startSystem() {

		Scanner inPut = new Scanner(System.in);
		String option;

		do {
			System.out.println();
			System.out.println("     Select Option");
			System.out.println("========================");
			System.out.println("| 0 - Exit             |");
			System.out.println("| 01 - Exercise1       |");
			System.out.println("| 02 - Exercise2       |");
			System.out.println("| 03 - Exercise3       |");
			System.out.println("| 04 - Exercise4       |");
			System.out.println("| 05 - Exercise5       |");
			System.out.println("| 06 - Exercise6       |");
			System.out.println("| 07 - Exercise7       |");
			System.out.println("| 08 - Exercise8       |");
			System.out.println("| 09 - Exercise9       |");
			System.out.println("========================");
			option = inPut.next();

			switch (option.toLowerCase()) {

			case "0", "exit":
				System.out.println("you chose to leave");
				break;

			case "1", "exercise1":
				exerciseUm();
				break;

			case "2", "exercise2":
				exerciseDois();
				break;

			case "3", "exercise3":
				exerciseTres();
				break;

			case "4", "exercise4":
				exerciseQuatro();
				break;

			case "5", "exercise5":
				exerciseCinco();
				break;

			case "6", "exercise6":
				exerciseSeis();
				break;

			case "7", "exercise7":
				exerciseSete();
				break;

			case "8", "exercise8":
				exerciseOito();
				break;

			case "9", "exercise9":
				exerciseNove();
				break;

			default:
				System.out.println("\"ERROR\" SELECT VALID OPTION");
				break;

			}

		} while (option.equals("0") == false);
	}

	// --------REPETING A PHRASE--------//
	public static void exerciseUm() {

		// Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar
		// Algoritmos" e quebre a linha a cada 5 repetições.

		System.out.println();

		for (byte contador = 1; contador <= 20; contador++) {

			System.out.print("Eu gosto de estudar Algoritmos " + (contador % 5 == 0 ? "\n" : ""));
		}
	}

	// --------ADDING FROM 1 TO 15--------//
	public static void exerciseDois() {

		// Escreva um algoritmo que calcule a soma dos números de 1 a 15.

		byte soma = 0;

		for (byte counter = 1; counter <= 15; counter++) {

			soma = (byte) (soma + counter);

			System.out.println("soma = soma + counter, " + soma + " = " + soma + " + " + counter + " ==>");

			System.out.println();

		}

	}

	// --------HOW MANY PEOPLES ARE ADULT?--------//
	public static void exerciseTres() {

		// Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade

		Scanner inPut = new Scanner(System.in);

		byte idade = 0, pessoa = 0, contador;

		for (contador = 1; contador < 6; contador++) {

			System.out.println("Informe a idade da pessoa " + contador);
			System.out.println();
			idade = inPut.nextByte();

			if (idade >= 18) {
				pessoa++;
				System.out.println("A ultima pessoa informada é maior de idade");
			}
		}

		System.out.println("Entre " + (contador - 1) + " pessoas, apenas " + pessoa + " são maiores de idade");
	}

	// --------ADDING UP TO AGE--------//
	public static void exerciseQuatro() {

		// Leia a idade de 20 pessoas e exiba a soma das idades

		int sumAge = 0;
		byte age;

		Scanner inPut = new Scanner(System.in);

		for (byte contador = 1; contador <= 5; contador++) {

			System.out.println("At this moment the sum is: " + sumAge);
			System.out.println("How old are you?");
			age = inPut.nextByte();
			sumAge = sumAge + age;
		}
		System.out.println("The sum was: " + sumAge);
	}

	// --------WHO IS THE NEWEST PERSON?--------//
	public static void exerciseCinco() {

		// Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

		Scanner inPut = new Scanner(System.in);
		String nameUser, younger = "";
		byte age, ageMinimal = 0;

		for (byte contador = 1; contador < 5; contador++) {

			System.out.println("What is your name?");
			nameUser = inPut.next();
			System.out.println(nameUser + " how old are you?");
			age = inPut.nextByte();

			// no primeiro laço sempre a menor idade vai ser the first
			if (contador == 1) {
				ageMinimal = age;
				System.out.println("Sou o mais novo por que estou no escopo 01");
				System.out.println();
			} else {
				// partir do segundo laço já tenho como comparar com ageMinimal
				System.out.println("Estou no laço " + contador + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println("Ainda bem que testei de novo porque a pessoa mais nova agora é " + nameUser);
					ageMinimal = age;
					younger = nameUser;
				}
			}
		}

		System.out.println();
		System.out.println("O mais novo é " + younger + " " + ageMinimal + " years old");

	}

	// --------WICH NUMBERS ARE EVEN--------//
	public static void exerciseSeis() {

		// Escreva um algoritmo que leia 20 números do usuário e exiba quantos números
		// são pares

		Scanner inPut = new Scanner(System.in);
		byte number = 0, sum = 0;

		for (byte contador = 1; contador < 6; contador++) {

			System.out.println("Digit five numbers:");
			number = inPut.nextByte();
			if (number % 2 == 0) {
				System.out.println("Even number : " + number);
				sum++;
			} else {
				System.out.println("odd number: " + number);
			}

		}

		System.out.println("Totally even numbers: " + sum);

	}

	// --------STUDENTS GRADES--------//
	public static void exerciseSete() {

		// Escreva um algoritmo que solicite a quantidade de notas e calcule a média do
		// aluno

		Scanner inPut = new Scanner(System.in);
		String nameUser, answer;
		byte grades = 0, contador = 1;
		float gradeStudent, sum = 0f;

		++grades;
		do {
			System.out.println("What your grade " + (contador++));
			gradeStudent = inPut.nextFloat();
			System.out.println("Quer capturar mais alguma nota?");
			answer = inPut.next();
			if (answer.equals("sim")) {
			}

			sum = sum + gradeStudent;

		} while (answer.equals("sim"));

		sum = sum / grades;

		System.out.println("soma= " + sum);

	}

	// --------LEAVE WITH NEGATIVE NUMBER--------//
	public static void exerciseOito() {

		// Escreva um algoritmo que leia uma sequência de números do usuário e realize a
		// soma desses números. Encerre a execução quando um número negativo for
		// digitado.

		Scanner inPut = new Scanner(System.in);
		int number, sum = 0; // se não inicializa um valor na váriavel ela fica com o valor lixo da memória.
		String exitMenu;

		do {

			System.out.println("What number do you want?");
			number = inPut.nextInt();
			if (number >= 0) {
				sum = sum + number;
			} // somente números positivos serão somados, ou números naturais.
			System.out.println("Do wou want exit?");
			exitMenu = inPut.next();

		} while (number >= 0 || (exitMenu.equals("yes"))); // enquanto o número for maior que zero repita

		System.out.println("Your sum is: " + sum);

	}

	// --------NUMBER BETWEEN 0 AND 100--------//
	public static void exerciseNove() {

		// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão
		// entre 0 e 100

		Scanner inPut = new Scanner(System.in);
		int number = 0;
		byte sum=0;

		for (byte contador = 1; contador < 6; contador++) {
			
			System.out.println("Digit five numbers: ");
			number = inPut.nextInt();
			
			if(number >= 0 && number <= 100) {
				sum++;
			} else {
				
			}
		}
		
		System.out.println("Your number between 0 and 100 are: " +sum);

	}
}
