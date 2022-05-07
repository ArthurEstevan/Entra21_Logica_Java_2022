## _Estrutura de Repetição For_ 

### _Declaração For_

>Baseadas em Quantidade:
>
>> For (ideal para repetições é baseada na quantidade e não na decisão).

#### _Atenção_
- Laços de repetição tem uma desvantagem bem perigosa e é necessário ter cuidado com a condição de saída para não criar um loop infinito que quebra a aplicação ou consome memória do dispositivo.
-
- A condição de saída é sempre uma variável que muda o seu valor dentro do loop e é verificada a cada repetição.
-
- Geralmente é uma variável de contador inteira .

#### Como escrever o código:

```
for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {

    System.out.println("Repetindo " + contador1);
    System.out.println("-------------");
}
```
