package br.com.Entra21.CondicionalIF;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre If");

		if (true) {
			System.out.println("Vai fazer isso quando der true");

		}

		System.out.println("Vai acontecer naturalmente pq o código segue sempre em frente");

		if (false) {
			// NUNCA PASSA POR ESSE BLOCO QUANDO RESULTA EM TRUE
		}

		byte idade = 18;

		if (idade >= 18) {
			System.out.println("é maior de idade?");
		}
		
		if( (idade>=13) && (idade<18) ) {//é adolescente? (13~~17)
			
			System.out.println("é adolescente");
		}

	}

}
