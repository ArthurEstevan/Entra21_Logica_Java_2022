## _Estrtura Vetores_ 

### _Declaração de Vetores_

>Os vetores constituem uma forma muito conveniente de organizar informações.
>
> Sintaxe:
>
>><tipo>[] variavel = new [tamanho];
>
>><tipo> variavel [] = new [tamanho];
>


#### _Vantagem_

- A quantidade de variáveis é reduzida e a performance na escrita de algoritmos também, pois resolve a situação:

- Capturar 10 notas e guardar os seus respectivos valores, sem uso de vetores seria necessário criar uma variável para cada nota e escrever individualmente a captura de cada nota.

- Com a utilização de vetores e laços de repetição é possível acessar o índice do vetor e armazenar a captura.

#### _Desvantagem_

- O vetor tem um tamanho limitado e não é possível mudar isso após a sua criação.

- A contagem inicia na posição 0 "zero" que é contra intuitivo inicialmente.

- Ao acessar posições que não existem geram exceções que quando não são tratadas encerram a aplicação. É muito comum esse acesso incorreto em laços de repetição.

- Com base nessas desvantagens outra desvantagem acaba ocorrendo que é criar mais espaços do que o necessário e dessa forma mais memória é alocada gastando os recursos da máquina e prejudicando a performance da execução.


#### Como escrever o código:

```
		byte idades[]; // primeiro crie o vetor atribuindo uma váriavel

		idades = new byte[15]; // segundo define o tamanho da variavel
		
        System.out.println("O que tem no indice [1] " + idade[1] ); // terceiro usar ou adicionar valor
```
