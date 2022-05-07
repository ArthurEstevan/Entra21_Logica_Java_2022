## _Estrutura Switch_ 

> O funcionamento da estrutura switch é bastante simples. Inicialmente, o valor da variável passada no switch é comparado com os valores fornecidos em cada case. Se um desses valores for igual ao valor da variável, o bloco de código do case em questão será executado.
>
>As comparações da estrutura switch são sempre feitas de forma sequencial e não há limite para a quantidade de cases que cada switch pode ter. Além disso, a estrutura switch também pode conter as declarações opcionais “break” e “default”.
>

#### Como escrever o código:

```
		System.out.println("1 = intervalo");
		System.out.println("2 = Exercício");
		System.out.println("3 = Prova");
		System.out.println();

		byte opcao;

		System.out.println("Escolha um Opção");
		opcao = inPut.nextByte();

		System.out.println();

		switch (opcao) {
		case 1:
			System.out.println("Vamos para o Intervalo.");
			break;
		case 2:
			System.out.println("Daqui apouco tem exercício.");
			break;
		case 3:
			System.out.println("Vamos fazer prova.");
			break;
		}
```
