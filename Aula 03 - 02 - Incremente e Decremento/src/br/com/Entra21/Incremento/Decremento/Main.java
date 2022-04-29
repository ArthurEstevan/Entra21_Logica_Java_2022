package br.com.Entra21.Incremento.Decremento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 18;

		System.out.println("Minha idade pós Incremento " + (idade++));
		System.out.println(idade);

		System.out.println("Minha idade pré Incremento " + (++idade));

		// aniversario idade = idade+1;

		System.out.println(idade);

		// ano 29/2 acontece de 4 em 4 anos idade = idade+4;
		System.out.println(idade);

		idade++; // É a mesma coisa que idade+1 System.out.println(idade);

		idade += 2; // É a mesma coisa que idade+2 System.out.println(idade);

		idade *= 2; // É a mesma coisa que idade *2 System.out.println(idade);

		idade /= 2;
		System.out.println(idade);

		idade = idade / 2;
		System.out.println(idade);

		idade--;
		System.out.println(idade);

		idade -= 10;
		System.out.println(idade);

		idade = idade - 10;
		System.out.println(idade);

	}

}
