## _Operador Ternário_ 

> O operador ternário é um recurso para tomada de decisões com objetivo similar ao:
>
>> (expressão booleana) ? código 1 : código 2;
>
>Ao avaliar a expressão booleana, caso ela seja verdadeira, o código 1, declarado após o ponto de interrogação (?) será executado; do contrário, o programa irá executar o código 2, declarado após os dois pontos (:).
>

### _Nota_
> Normalmente esse operador é utilizado quando precisamos de uma estrutura de decisão simples, por exemplo, para iniciar uma variável, retornar um valor ou integrar um bloco de código no qual um if/else pode torná-lo maior e menos legível.

#### Como escrever o código:

```
byte idade= 15;
		
System.out.println("Você é de maior? " + (idade>17? "de maior": "de menor") );
```
