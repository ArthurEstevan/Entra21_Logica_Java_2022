## _Estrutura IF/Else_ 

> A estrutura condicional:
>
>> if (expressão booleana) { // bloco de código 1} else { // bloco de código 2}
>
>As instruções presentes no bloco de código 1 serão executadas caso a expressão booleana seja verdadeira. Do contrário, serão executadas as instruções presentes no bloco de código 2.
>
>O Java utiliza as chaves como delimitadores de bloco e elas têm a função de agrupar um conjunto de instruções. Apesar do uso desses delimitadores ser opcional caso haja apenas uma linha de código, ele é recomendado, pois facilita a leitura e manutenção do código, tornando-o mais legível.

### _Nota_
> A declaração do else não é obrigatória. Para muitas situações apenas o if é suficiente.

#### Como escrever o código:

```
byte idade = 18;

		if (idade >= 18) {
			System.out.println("Maior de Idade");
		}
		
		System.out.println();
		
		if( (idade>=13) && (idade<18) ) {
			System.out.println("é adolescente");
		}
```
