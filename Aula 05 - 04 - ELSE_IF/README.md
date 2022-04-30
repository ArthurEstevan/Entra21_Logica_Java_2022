## _Estrutura ELSE/IF_ 

> Complementar ao:
>
>> if (expressão booleana 1) { // bloco de código 1} else if (expressão booleana 2) { // bloco de código 2} else { // bloco de código 3}
>
>Dessa forma, se a expressão booleana 1 for verdadeira, o bloco de código 1 será executado. Caso seja falsa, o bloco de código 1 será ignorado e será testada a expressão booleana 2. Se ela for verdadeira, o bloco de código 2 será executado. Caso contrário, o programa vai ignorar esse bloco de código e executar o bloco 3, declarado dentro do else.
>
>Podemos utilizar quantos else if forem necessários. Entretanto, o else deve ser adicionado apenas uma vez, como alternativa ao caso de todos os testes terem falhado.

### _Nota_
> Em trechos de código com muitos if/else e else if, considere o uso da estrutura switch/case, ou mesmo padrões de projeto. O uso de estruturas de condição aninhadas torna o código difícil de ler e escrever.

#### Como escrever o código:

```
float altura = 1.7f;

		if(altura<1.5f) {
			System.out.println("Baixo");
		}else if(altura<1.9f) { 
			System.out.println("Alto");
		}else {
			System.out.println("Avatar");
		}
```
